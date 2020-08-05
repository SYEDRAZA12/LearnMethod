package arrays;

import org.w3c.dom.ls.LSOutput;

public class TwoDimentional<student_record> {
    public static void main(String[] args) {
        String studentRecord[][] = new String[3][2];
        System.out.println(studentRecord.length);
        //1st Row

        System.out.println("******************************");
        studentRecord[0][0] = "stID";
        studentRecord[0][1] = "stName";

        //2st Row
        studentRecord[1][0] = "999999";
        studentRecord[1][1] = "raza";

        //3rd Row
        studentRecord[2][0] = "44444";
        studentRecord[2][1] = "iram";

        System.out.println(studentRecord[2][0]);

        for (String stdInfo[] : studentRecord) {
            for (String std : stdInfo) {
                System.out.println(std);
            }
            System.out.println(studentRecord[2][1]);


        }


    }


};

