package arrays;

public class MultidimentionalArray {

    public static void main(String[] args) {

        // declaration of 2 dimensional arrays
        String[][] studentRecord= new String[4][4];

          //1st row
        try{
        studentRecord[0][0]="contry name";
        studentRecord[0][1]="country id";
        studentRecord[0][2]="city name";
        studentRecord[0][3]="city id";

        //2nd row
        studentRecord[1][0]="USA";
        studentRecord[1][1]="0001";
        studentRecord[1][2]="NEW YORK";
        studentRecord[1][3]="YYZ";

        //3 row
        studentRecord[2][0]="CANADA";
        studentRecord[2][1]="0002";
        studentRecord[2][2]="VANCOUVER";
        studentRecord[2][3]="YVR";

        //5 row

        studentRecord[4][0]="CANADA";
        studentRecord[4][1]="0002";
        studentRecord[4][2]="VANCOUVER";
        studentRecord[4][3]="YVR";
        }catch (Exception e){
           // e.printStackTrace();
            System.out.println("ArrayIndexOutOfBoundsException");
        }


        for (String str[]:studentRecord) {
            for (String x: str) {
                System.out.println(x);

            }


        }





    }


}
