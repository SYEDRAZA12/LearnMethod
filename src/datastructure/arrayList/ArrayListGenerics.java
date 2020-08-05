package datastructure.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListGenerics {

    public static void main(String[] args) {
        List<String> obj1= new ArrayList<String>();

        obj1.add("Country Name");
        obj1.add("Raza");
        obj1.add("Selenium");
        obj1.add("QTP");
        obj1.add("Raza");
        obj1.add("Selenium");
        obj1.add("QTP");
        obj1.add("Raza");
        obj1.add("Selenium");
        System.out.println(obj1.size());
        System.out.println(obj1.get(4));

        for (String xyz: obj1) {
            System.out.println(xyz);
            
        }
        

    }
}
