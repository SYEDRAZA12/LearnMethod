package basic;

public class FindGreatest {
    public static void main(String[] args) {
        int a = 35;
        int b = 78;
        int c = 87;
        if (a > b && a > c) {
            System.out.println("The Greatest Number is " + a);
        } else if (b > c) {
            System.out.println("The Greatest Number is " + b);

        } else {
            System.out.println("The Greatest Number is " + c);
        }
    }
}
