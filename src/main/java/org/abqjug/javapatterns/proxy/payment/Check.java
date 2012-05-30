package org.abqjug.javapatterns.proxy.payment;

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
        Payment withdraw = bankAccount.withdraw(amount);
        return withdraw.withdraw();
    }

    public int getAmount() {
        return amount;
    }
}
