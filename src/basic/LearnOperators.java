package basic;

import java.util.Scanner;

public class LearnOperators {


    public int getRemainder(int a, int b) {

        int remainder = a % b;

        return remainder;
    }

    public static void main(String[] args) {
        LearnOperators obj = new LearnOperators();
        Scanner myScan = new Scanner(System.in);

        System.out.println("Please enter your First Numeric value");
        int x = myScan.nextInt();
        System.out.println("Please enter your Second Numeric value");
        int y = myScan.nextInt();
        int myRemainder = obj.getRemainder(x, y);
        System.out.println("Your Remainders value is " + myRemainder);
    }
}
