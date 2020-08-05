package datastructure.arrayList.arrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class ArrayList2 {

    public static void main(String[] args) {


        ArrayList obj1 = new ArrayList();

        obj1.add(78665);
        obj1.add("Ramdane");
        obj1.add(12.4343443);
        obj1.add('M');
        obj1.add(12.4343443);
        obj1.add(12.4343443);
        obj1.add("Ramdane");
        obj1.add("Shakir");

        // System.out.println(obj1);

        //System.out.println(Arrays.toString(obj1));

        System.out.println(obj1.get(2));
        System.out.println(obj1.size());
        int size = obj1.size();

        for (int i = 0; i < size; i++) {
            System.out.println(obj1.get(i));
        }
        System.out.println("***********For Each**************");
//for(DataType veriable : arrayname)


        for (Object xyz : obj1) {
            System.out.println(xyz);

        }
        System.out.println("***********(Iterator)**************");

        // Iterator

        Iterator itr = obj1.iterator();

        while (itr.hasNext()) {
            Object xyz = itr.next();
            System.out.println(xyz);

        }


        //int student [] = new int[4];
        // student[0]=333;
        //student[0]="fsdfaffd";


    }
}
