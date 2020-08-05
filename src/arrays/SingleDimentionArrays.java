package arrays;

public class SingleDimentionArrays {

    public static void main(String[] args) {

        /**
         * each memory location contains 4 bytes in total this array takws 4*5=20 bytes
         */
        int student_id[] = new int[5];
        student_id[0] = 43;
        student_id[1] = 20;
        student_id[2] = 300;
        student_id[3] = 1;
        student_id[4] = 20000;
        System.out.println(student_id[4]);
        //for(int i =0;i<student_id.length;i++)
        for (int std : student_id) {
            System.out.println(std);


        }

        System.out.println("******************************");

        String[] student_name = {"james", "iram", "raza"};
        System.out.println(student_name.length);
        for (String st : student_name) {
            System.out.println(st);

        }


//        try {
//            student_id[5] = 4000;
//            System.out.println(student_id[5]);
//
//        } catch (Exception e) {
//            //  e.printStackTrace();
//            System.out.println("Array Index Out Of Bounds Exception");
//
//        }
    }
}
