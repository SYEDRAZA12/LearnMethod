package dataReader2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Fr {
    public static void main(String[] args) {

        //String filePath = "src/dataReader2/TestFile";
        String filePath="/Users/syedraza/IdeaProjects/PracticeJavaBasics/src/dataReader2/TestFile";
        readFile(filePath);


    }
    public static void readFile( String filePath){


        FileReader fileReader = null;
        BufferedReader bufferedReader= null;

        try{
            fileReader=new FileReader(filePath);
            bufferedReader=new BufferedReader(fileReader);
            String data;
            while((data=bufferedReader.readLine()) != null){
                System.out.println(data);
            }

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("File Not Found Exception");
        }finally {
            try{
                fileReader.close();
                bufferedReader.close();

            }catch (Exception e){
                e.printStackTrace();
                System.out.println("File is after try block Closed");


            }
        }

    }
}
