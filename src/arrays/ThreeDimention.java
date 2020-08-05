package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ThreeDimention {

    public static void main(String[] args) {

        String[][][] world_record = new String[3][3][5];

//
////1st 2D array first row
//        world_record[0][0][0] = "Country_Name";
//        world_record[0][0][1] = "Country_ID";
//        world_record[0][0][2] = "State_Name";
//        world_record[0][0][3] = "State_ID";
//        world_record[0][0][4] = "City";
//
//
////1st 2D array 2nd row
//        world_record[0][1][0] = "USA";
//        world_record[0][1][1] = "001";
//        world_record[0][1][2] = "NEW YORK=";
//        world_record[0][1][3] = "1234";
//        world_record[0][1][4] = "New York City";
//
//        //   3RD 2D array 2nd row
//        world_record[2][1][0] = "canada";
//        world_record[2][1][1] = "002";
//        world_record[2][1][2] = "ALBERTA=";
//        world_record[2][1][3] = "0987";
//        world_record[2][1][4] = "EDMONTON";
//
//
//        for (String str[][] : world_record) {
//            for (String str1[] : str) {
//
//                System.out.println(Arrays.toString(str1));
//                //  for (String str2:str1) {
//                //System.out.println(str2);
//
//            }

        String[][][] world = {
                {
                        {"Contry_id", "Country_Name", "Country_Size"},
                        {"001", "USA", "232322"},
                        {"002", "canada", "3434343"}
                }
        };

        for (String str1[][] : world) {
            for (String str2[] : str1) {
                System.out.println(Arrays.toString(str2));
//                for (String str3 : str2) {
//                    System.out.println(str3);
            }

        }


    }

}






