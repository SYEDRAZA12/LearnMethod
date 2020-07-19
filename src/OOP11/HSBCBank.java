package OOP11;

public class HSBCBank extends Finance {
    @Override
    public void minHR() {
        System.out.println("Minimum Hr should be 50");

    }

    @Override
    public void autoLoan() {
        System.out.println("HSBC Bank Provides autoLoan ");

    }

    @Override
    public void studentLoan() {
        System.out.println("HSBC Bank Provides studentLoan ");

    }

    @Override
    public void debit() {
        System.out.println("HSBC Bank Provides debit Transactions ");

    }

    @Override
    public void credit() {
        System.out.println("HSBC Bank Provides credit Transactions  ");

    }

    public void mortgageLoan() {
        System.out.println("HSBC provides mortgageLoan");
    }
}
