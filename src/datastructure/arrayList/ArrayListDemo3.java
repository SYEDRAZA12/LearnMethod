package datastructure.arrayList;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {

        ArrayList obj1 = new ArrayList();

        obj1.add(324234234);
        obj1.add('M');
        obj1.add("raza");
        obj1.add(12.432);
        obj1.add('M');
        obj1.add('M');

        System.out.println(obj1.size());
        // System.out.println(obj1);
        System.out.println(obj1.get(1));
        // System.out.println(obj1.get(5));

        for (Object xyz:obj1) {
            System.out.println(xyz);

        }

    }
}
