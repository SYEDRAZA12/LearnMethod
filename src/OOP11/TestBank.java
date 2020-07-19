package OOP11;

public class TestBank {

    public static void main(String[] args) {
//        HSBCBank hs = new HSBCBank();
//        hs.autoLoan();
//        hs.credit();
//        hs.debit();
//        hs.mortgageLoan();
//        System.out.println("Minimum Balance should be "+USBank.min_Banlance);
//        System.out.println("--------------------------------");
//        USBank us = new HSBCBank();
//
//        us.credit();
//        us.debit();
//
//        System.out.println("--------------------------------");
//
//        CBCBank cb = new HSBCBank();
//
//        cb.autoLoan();
//        cb.studentLoan();

        Finance fc= new HSBCBank();
        HSBCBank hs=new HSBCBank();
        USBank us=new HSBCBank();
        CBCBank cb=new HSBCBank();
        System.out.println("Minimum banlance  of account should be "+Finance.min_Balance);
        System.out.println("Minimum equity of bank should be should be "+fc.equity);
        fc.minBranches();
        fc.minHR();
        fc.autoLoan();
        fc.credit();
        fc.debit();
        fc.studentLoan();

        System.out.println("============================");
        hs.mortgageLoan();

        System.out.println("============================");
        us.debit();
        us.credit();

        System.out.println("============================");

        cb.studentLoan();
        cb.autoLoan();









    }
}
