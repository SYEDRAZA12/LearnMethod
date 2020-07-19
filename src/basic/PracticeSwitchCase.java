package basic;

import java.util.Scanner;

public class PracticeSwitchCase {

    public void foodMenu(int foodSerial) {

        String foodName;
        switch (foodSerial) {
            case 1:
                foodName = "Pizza";
                break;
            case 2:
                foodName = "Burger";
                break;
            case 3:
                foodName = "Biryani";
                break;
            case 4:
                foodName = "Nihari";
                break;
            case 5:
                foodName = "Kabab";
                break;
            default:
                foodName = "Invalid";
                break;
        }
        System.out.println("Your Order is" + " " + foodName);
    }

    public static void main(String[] args) {
        PracticeSwitchCase obj = new PracticeSwitchCase();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your food serial number");
        int x = sc.nextInt();
        obj.foodMenu(x);
    }
}