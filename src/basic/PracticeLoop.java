package basic;


import java.util.Scanner;

public class PracticeLoop {
    void myParmid() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the ");
        int numOfRow = sc.nextInt();
        int i = 1;
        int j = 1;

        while (i <= numOfRow) {
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i++;

        }
    }

    static void forLoop() {
        int i;
        for (i = 1; i <= 3; i++) {
            System.out.println("For Loop is Running");
        }
        System.out.println("For loop is Ended");
    }

//    PracticeLoop() {
//        int i = 1;
//        do {
//            System.out.println("Do While Loop is Running");
//            i++;
//        } while (i <= 3);
//        System.out.println("while Loop ended");
//    }

    public static void main(String[] args) {
        PracticeLoop obj = new PracticeLoop();
        //obj.forLoop();
        // forLoop();
        // obj.whileLoop();
        //whileLoop();
        obj.forEachLoop();
        //obj.foreachArrays();
        //obj.myParmid();
    }

    static void whileLoop() {
        int i = 1;
        while (i <= 3) {
            System.out.println("While Loop is Running");
            i++;
        }
        System.out.println("While Loop Ended");
    }

    void forEachLoop() {
        int a[] = {3, 5, 7, 9};

        for (int i : a) {
            System.out.println("Arrays Values are" + " " + i);
        }
    }

    void foreachArrays() {
        int a[] = new int[5];
        a[0] = 4;
        a[1] = 7;
        a[2] = 8;
        a[3] = 9;
        a[4] = 10;
        for (int i = 0; i <= a.length; i++) {
            System.out.println("Arrays Values are" + a[i]);
        }
        for (int i : a) {
            System.out.println("Arrays Values are" + " " + i);
        }

    }
}

