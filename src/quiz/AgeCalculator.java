package quiz;

import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {

        int minAge = 18;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your age");

        int myAge = sc.nextInt();

        if (myAge >= minAge) {
            System.out.println("You are eligible for vote");
        } else {
            System.out.println("You are not eligible fore vote");
        }


    }
}
