package quiz;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        findPalindrome();



    }

    /**
     * this method to find out input string is Palindrome
     */
    public static void findPalindrome(){
        System.out.println("Enter string to reverse:");
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();


        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if (reverse.equalsIgnoreCase(str)) {
            System.out.println("Entered String is Palindrome");

        } else {
            System.out.println("Entered String is Not Palindrome");

        }
        read.close();

    }
}


//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Please enter any String");
//        String st2 = sc.nextLine();
//        String st1 = "";
//
//        for (int i = st2.length(); i >= 0; i--) {
//            st1 = st1 + st2.charAt(i);
//
//        }
//        System.out.println(st1);


//    }


