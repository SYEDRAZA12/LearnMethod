package dataReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {



    public static void main(String[] args) {
        String filePath = "src/dataReader/Sample1.txt";
        try {
            readFile(filePath);
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("File Not found exception");
        }

    }

    public static void readFile(String filePath) throws FileNotFoundException {


        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        try{
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);

            String data;
            while ((data=bufferedReader.readLine())!=null){
                System.out.println(data);
            }
        }catch (Exception e){
            //e.printStackTrace();
            System.out.println("File Not Foud Exception");

        }finally {
            try{
                fileReader.close();
                bufferedReader.close();

            }catch (Exception e){
               // e.printStackTrace();
                System.out.println("File is already closed");

            }
        }






    }




}
