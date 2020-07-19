package basic;

public class LearnMethods {
    int age;
    String address;
    String xyz;

//Non return Method without Parameter
    public void doSum() {
        int a = 5;
        int b = 6;
        int sum = a + b;
        System.out.println("MY some is " + sum);
        System.out.println("This is my non return type non parameter method");
    }
//None Return with Parameter
    public void dosub(int a, int b) {

        int sub = a - b;
        System.out.println("MY subtraction is  " + sub);
        System.out.println("This is my non return type with parameter method");
    }
//Retrun type with parameter
    public int doMulty(int a, int b) {

        int multy = a * b;
        System.out.println("MY Multiplication is  " + multy);
        System.out.println("This is my return type with parameter method");
        return multy;
    }
//Return type without parameter
    public String doDiv() {
        int a = 20;
        int b = 5;
        int div = a / b;
        String xyz = "Raza";
        System.out.println("MY Division is  " + div);
        System.out.println("This is my return type with without parameter method");
        return xyz;
    }

    public static void main(String[] args) {
        LearnMethods obj = new LearnMethods();
        //obj.doSum();
       // obj.dosub(7, 5);
        //obj.doMulty(5, 10);
        //obj.doDiv();
       // String z=obj.doDiv();
       // System.out.println(z);
        int multyPlication  = obj.doMulty(6,10);
        System.out.println("My last multyplaction is "+ multyPlication);

    }

}
