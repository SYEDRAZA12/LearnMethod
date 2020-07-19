package oop1;

import jdk.swing.interop.SwingInterOpUtils;

public class HSBCBank implements USBank, CBC {
    // CBC BANK METHODS
    public void educationLoan() {
        System.out.println("HSBC BANK provides  educationLoan");

    }

    public void homeLoan() {
        System.out.println("HSBC BANK provides  homeLoan");

    }

    public void carLoan() {
        System.out.println("HSBC BANK provides  homeLoan");

    }

    //US BANK METHODS
    public void debit() {
        System.out.println("HSBC BANK provides  carLoan");

    }

    public void credit() {
        System.out.println("HSBC BANK provides  credit");

    }

    public void transferMoney() {
        System.out.println("HSBC BANK provides  transferMoney");

    }

    public void trading() {
        System.out.println("HSBC BANK provides  trading");

    }

    public void mutualFunds() {
        System.out.println("HSBC BANK provides mutualFunds");

    }
    public void insurance(){
        System.out.println("HSBC BANK provides insurance");

    }
}
