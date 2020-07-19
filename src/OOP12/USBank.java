package OOP12;
//no method body , only method deceleration
//interface  is prototype
//can't create the object of interface
//no static method
//interface variables are static in nature by default
//Interfaces have 100% abstraction
//abstraction can be happen from 0 - 100 %

// in abstract classes we achieve partial abstraction
//we cannot create object of abstract class
public interface USBank {

     int min_Balance = 100;

    public void debit();
    public void credit();
    public void socialDistancing();
}
