package basic;

public class switchStatements {

    public static void main(String[] args) {
        char grade = 'B';


        switch (grade) {

            case 'A':
                System.out.println("Your Grade is A, Excellent Job");
                break;
            case 'B':
                System.out.println("Your Grade is B, Good Job");
                break;
            case 'C':
                System.out.println("Your Grade is C, you did okay");
                break;
            case 'D':
                System.out.println("Your Grade is C, You did poorly");
                break;
            case 'F':
                System.out.println("Your Grade is F, Your are fail");
                break;
            default:
                System.out.println("You entered invalid entry");
        }
    }
}
