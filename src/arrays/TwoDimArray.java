package arrays;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class TwoDimArray {

    public static void main(String[] args) {

        //String[] student_name = {"james", "iram", "raza"};

        String[][] countyRecord = {
                {"country_id", "Country Name", "City Name", "City ID"},
                {"0001", "USA", "NEW YORK", "XYZ"},
                {"0002", "CANADA", "VANCOUVER", "YVZ"},
                {"0003", "CANADA", "EDMONTON", "DSFASF"},
        };

        //System.out.println(countyRecord[3][2]);

        for (String xyz[]:countyRecord) {

            System.out.println(Arrays.toString(xyz));
            //for (String x:xyz) {
                //System.out.println(x);


        }






}
}
