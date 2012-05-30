package org.abqjug.javapatterns.proxy.payment;

/**
 * @author John Ericksen
 */
public class Money implements Payment {

    private int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public int withdraw() {
        int withdrawAmount = amount;
        amount = 0;
        return withdrawAmount;
    }

    public int getAmount() {
        return amount;
    }
}
