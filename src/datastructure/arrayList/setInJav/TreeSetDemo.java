package datastructure.arrayList.setInJav;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> values = new TreeSet<>();

        values.add("sara");
        values.add("raza");
        values.add("gana");

        System.out.println(values);

        LinkedList <String> linky_values=new LinkedList<String>(values);

        System.out.println(linky_values.get(2));
        System.out.println(linky_values);
        System.out.println(linky_values.size());


    }
}
