package basic;

import java.util.Scanner;

public class LearnCondOpr {


    public void voteElig(int age, boolean status) {

        if (!(age<= 18 || status == true)) {
            System.out.println("Your are eligible for Vote");
        } else {
            System.out.println("Sorry you are'nt eligible for Vote");
        }
    }
    public static void main(String[] args) {

        LearnCondOpr obj = new LearnCondOpr();
        Scanner myScan = new Scanner(System.in);

        System.out.println("Please enter you age");
        int age = myScan.nextInt();
        System.out.println("Are you Citizen? Please Enter True/False");
        boolean status = myScan.nextBoolean();
//        String status = "Yes";
        obj.voteElig(age, status);
    }
}
