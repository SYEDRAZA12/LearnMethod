package datastructure.arrayList.stack.bubbleSort;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BubbleSortStrings {
    public static void main(String[] args) {


        String [] num = {"Shakir","Raza","LemLem","Jony","Mobin"};
        String temp;
        for (int i =0; i<num.length; i++){
            int flag=0;
            for (int j = 0;j<num.length-1-i; j++ ){
                if(num[j].compareToIgnoreCase(num[j+1])>0){
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                    flag=1;
                }
                if (flag==0){
                    break;
                }
            }
        } for (int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");

        }
    }
}
