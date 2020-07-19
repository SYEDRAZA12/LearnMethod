package basic;

public class ifStatments {
    public static void main(String[] args) {

        int temprature = 80;
        boolean sunny = false;

        if (temprature > 90) {
            System.out.println("Its is Hot out there");
            if (sunny == true) {
                System.out.println("It is sunny out there");
            } else {
                System.out.println("it is cloudy out there");
            }
        } else {
            System.out.println("It is not Hot out there");
            if (sunny == true) {
                System.out.println("It is sunny out there");
            } else {
                System.out.println("it is cloudy out there");
            }
        }

    }
}
