package datastructure.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo4 {
    public static void main(String[] args) {

        ArrayList obj1 = new ArrayList();

        obj1.add(324234234);
        obj1.add('M');
        obj1.add("raza");
        obj1.add(12.432);

        Iterator  itr=obj1.iterator();

        while (itr.hasNext()){
            Object value=itr.next();
            System.out.println(value);
        }


    }
}
