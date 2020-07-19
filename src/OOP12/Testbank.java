package OOP12;

public class Testbank {

    public static void main(String[] args) {

        HSBCBank hs=new HSBCBank();

        hs.socialDistancing();
        hs.studentLoan();
        hs.debit();
        hs.credit();
        hs.carLoans();
        hs.tradingAccouts();
        hs.commerceAccounts();
        System.out.println("Minimum Balance requirements are "+USBank.min_Balance);
        System.out.println("minmumum branches requirements are "+hs.numberOfBranches);

        System.out.println("==========USBANK=======================");

        USBank us= new HSBCBank();
        us.debit();
        us.debit();
        us.credit();

        System.out.println("==============FINANCE============ ");

        Finance fc = new HSBCBank();
        fc.commerceAccounts();
        fc.tradingAccouts();
        fc.debit();
        fc.credit();
        fc.carLoans();
        fc.socialDistancing();
        fc.studentLoan();
        System.out.println("Number of Branches "+fc.numberOfBranches);

        System.out.println("=========CBC BANK==================");
        System.out.println("Number of Branches "+fc.numberOfBranches);

        CBCBank cb = new HSBCBank();

        cb.studentLoan();
        cb.carLoans();


























//
//        HSBCBank hs=new HSBCBank();
//
//
//        hs.carLoans();
//        hs.credit();
//        hs.debit();
//        hs.mortgageLoans();
//        hs.studentLoan();
//        System.out.println(USBank.min_Balance);
//        System.out.println(hs.accounts);
//        hs.socialDistancing();
//        System.out.println("===============================");
//
//
//        USBank us=new HSBCBank();
//
//
//        us.credit();
//        us.debit();
//        us.socialDistancing();
//        System.out.println("===============================");
//
//
//        CBCBank cb=new HSBCBank();
//
//
//        cb.carLoans();
//        cb.studentLoan();
//
//




    }
}
