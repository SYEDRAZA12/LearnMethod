package quiz;

import java.util.Scanner;

public class IncresingDecresing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first numeric value ");

        Double x = sc.nextDouble();

        System.out.println("Please enter your Second numeric value ");

        Double y = sc.nextDouble();
        System.out.println("Please enter your third numeric value ");

        Double z = sc.nextDouble();


        if (x > y && x > z) {
            System.out.println("This is decreasing order ");
        } else if (x < y && y < z) {
            System.out.println("This is increasing order ");

        } else {
            System.out.println("It is neither increasing nor decreasing order ");

        }


    }

}
