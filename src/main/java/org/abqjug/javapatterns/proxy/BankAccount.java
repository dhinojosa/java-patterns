package org.abqjug.javapatterns.proxy;

/**
 * @author John Ericksen
 */
public class BankAccount {

    private int balance;
    private String name;

    public BankAccount(String name, int balance) {
        this.balance = balance;
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public synchronized Payment withdraw(int amount) {
        balance -= amount;
        return new Money(amount);
    }

    public synchronized Payment withdrawSecured(Authority authority, int amount) {
        return new SecuredPayment(authority, withdraw(amount));
    }

    public synchronized void deposit(Payment money) {
        balance += money.withdraw();
    }

    public Payment cutCheck(int amount) {
        return new Check(this, amount);
    }

    @Override
    public String toString() {
        return "\t" + name + " Balance: " + balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
