package org.abqjug.javapatterns.proxy.payment;

/**
 * @author John Ericksen
 */
public class SecuredPayment implements Payment {

    private Authority authority;
    private Payment withdraw;

    public SecuredPayment(Authority authority, Payment withdraw) {
        this.authority = authority;
        this.withdraw = withdraw;
    }

    public int withdraw() {
        if (authority.canProcessPayment()) {
            return withdraw.withdraw();
        }
        return 0;
    }

    public int getAmount() {
        return withdraw.getAmount();
    }
}
