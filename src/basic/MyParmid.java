package basic;

import java.util.Scanner;

public class MyParmid {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int numOfRow = input.nextInt();

        for (int i = 1; i <= numOfRow; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}