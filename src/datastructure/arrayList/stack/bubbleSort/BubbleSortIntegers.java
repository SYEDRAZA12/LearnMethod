package datastructure.arrayList.stack.bubbleSort;

public class BubbleSortIntegers {

    public static void main(String[] args) {

        int [] num = {36,19,29,12,5};
        int temp;
        for (int i =0; i<num.length; i++){
            int flag=0;
            for (int j = 0;j<num.length-1-i; j++ ){
                if(num[j]>num[j+1]){
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
