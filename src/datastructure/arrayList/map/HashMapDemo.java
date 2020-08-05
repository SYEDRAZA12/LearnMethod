package datastructure.arrayList.map;

import com.sun.source.tree.Tree;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {
        TreeMap<String, String> obj1 = new TreeMap<String, String>();


        obj1.put("zr", "Virgina");
        obj1.put("aa", "New York");
        obj1.put("bb", "Vancouver");
        obj1.put("dd", "Toronto");
        obj1.put("cd", "Toronto");
        obj1.put("cy", " Edmonton");
        obj1.put("xy", "Calgary");


        System.out.println(obj1);
        System.out.println(obj1.size());
        for (Map.Entry<String, String> data : obj1.entrySet()) {
            System.out.println("Keys " + data.getKey() + " Values  " + data.getValue());

        }



    }
}
