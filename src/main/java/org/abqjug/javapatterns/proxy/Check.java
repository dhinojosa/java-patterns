package org.abqjug.javapatterns.proxy;

/**
 * @author John Ericksen
 */
public class Check implements Payment {

    private BankAccount bankAccount;
    private int amount;

    public Check(BankAccount bankAccount, int amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    public int withdraw() {
        return bankAccount.withdraw(amount).withdraw();
    }

    public int getAmount() {
        return amount;
    }
}
