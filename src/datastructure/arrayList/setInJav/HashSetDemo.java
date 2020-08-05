package datastructure.arrayList.setInJav;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet values = new LinkedHashSet();


        values.add(3234322);
        values.add("Raza");
        values.add("shakir");


        System.out.println(values.contains("shakir"));
        Iterator it = values.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("*************************");
        for (Object st: values) {
            System.out.println(st);
        }

    }


}
