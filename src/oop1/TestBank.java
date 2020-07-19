package oop1;

public class TestBank {

    public static void main(String[] args) {
       // USBank us = new USBank();

        HSBCBank hs= new HSBCBank();
        hs.carLoan();
        hs.credit();
        hs.debit();
        hs.insurance();
        System.out.println("US bank regulation say minimum balance should be "+USBank.min_Balance);
        USBank us = new HSBCBank();
        System.out.println("US bank Methods are running ______________");
        us.credit();
        us.debit();
        us.trading();
        us.transferMoney();





    }
}
