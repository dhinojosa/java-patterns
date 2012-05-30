package org.abqjug.javapatterns.proxy.payment;

/**
 * @author John Ericksen
 */
public class PaymentDemonstration {

    public static void main(String[] args) {

        PaymentDemonstration demonstration = new PaymentDemonstration();

        demonstration.direct();
        demonstration.check();
        demonstration.authorization();
    }

    public void direct() {
        System.out.println("Direct Money Transfer");

        BankAccount bankAccount1 = new BankAccount("One", 10000);
        BankAccount bankAccount2 = new BankAccount("Two", 100);

        logAccounts("Before withdraw", bankAccount1, bankAccount2);

        Payment oneHundred = bankAccount1.withdraw(100);

        logAccounts("After withdraw", bankAccount1, bankAccount2);

        bankAccount2.deposit(oneHundred);

        logAccounts("After Deposit", bankAccount1, bankAccount2);
    }

    public void check() {
        System.out.println("Check Money Transfer");
        BankAccount bankAccount1 = new BankAccount("One", 10000);
        BankAccount bankAccount2 = new BankAccount("Two", 100);

        logAccounts("Before withdraw", bankAccount1, bankAccount2);

        Payment check = bankAccount1.cutCheck(100);

        logAccounts("After withdraw", bankAccount1, bankAccount2);

        bankAccount2.deposit(check);

        logAccounts("After Deposit", bankAccount1, bankAccount2);
    }

    private void authorization() {
        System.out.println("Check Money Transfer");
        BankAccount bankAccount1 = new BankAccount("One", 10000);
        BankAccount bankAccount2 = new BankAccount("Two", 100);
        Authority authority = new Authority();

        logAccounts("Before withdraw", bankAccount1, bankAccount2);

        Payment check = bankAccount1.withdrawSecured(authority, 100);

        logAccounts("After withdraw", bankAccount1, bankAccount2);

        bankAccount2.deposit(check);

        logAccounts("After Deposit", bankAccount1, bankAccount2);

        authority.authorize("please");

        bankAccount2.deposit(check);

        logAccounts("After Magic Word", bankAccount1, bankAccount2);
    }

    private void logAccounts(String message, BankAccount bankAccount1, BankAccount bankAccount2) {
        System.out.println(message);
        System.out.println(bankAccount1);
        System.out.println(bankAccount2);
    }
}
