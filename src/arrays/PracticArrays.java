package arrays;

import java.util.Arrays;

public class PracticArrays {

    public static void main(String[] args) {


        int a = 10;
        int b = 20;
        int c = 200;

        int[] std = new int[4]; // declaration of arrays.
        //System.out.println(std.length);

        //each location 4 bytes
        // total space we 16 bytes.

        // initialized the array

        std[0] = 223;
        std[1] = 300;
        std[2] = 400;
        std[3] = 500;
//        std[0]=223;
//        std[0]=223;
//
//        System.out.println(std[0]);
//        System.out.println(std[3]);
        // System.out.println(std[4]);

        for (int i = 0; i < std.length; i++) {
            System.out.println(std[i]);

        }

        System.out.println("*********For Each Loop******************");

        for (int x : std) {
            System.out.println(x);
        }

        System.out.println("********2nd array*****************");


        // you are declaring and initializing array
        String []student ={"joney","shakir","mobin"};
        System.out.println(student.length);

      //  System.out.println(student[0]);
        //System.out.println(Arrays.toString(student));


//        for (String stu:student)
//              {
//                  System.out.println(stu);
//
//        }









    }
}
