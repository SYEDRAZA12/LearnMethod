package datastructure.arrayList.setGroupSession;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {


        TreeSet<String> values = new TreeSet<String>();//Non Generic Collection





        values.add("Shakir");
        values.add("Mobin");
        values.add("Joney Bhiya");
        values.add("Sumit");
        values.add("Shakir");
        values.add("Ramdane");



        System.out.println(values);
        System.out.println("My HasSet elements size is " + values.size());


        System.out.println("*******Link List Date************");
        ArrayList<String> xyz = new ArrayList<String>(values);



        System.out.println("my Link List Size is "+xyz.size());
        System.out.println(xyz);
        System.out.println(xyz.get(2));
        System.out.println(xyz.get(1));
        System.out.println(xyz.indexOf("Mobin"));


    }


}
