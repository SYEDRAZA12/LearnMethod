package oop1;

public interface USBank {
    int min_Balance = 100;//Interface variables are Static in nature


    public void debit();
    public void credit();
    public void transferMoney();
    public void trading();

    //no method body , only method declation
    // we is prototype
    //can't create the object of interface
    //no static method
    //interface variables are static in nature by default
    //Interfaces have 100% abstraction
    // in abstract classes we achieve partial abstraction
    //we cannot create object of abstract class
    //abstraction can be happen from 0 - 100 %



}
