package datastructure.arrayList.arrayList2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayList3 {

    public static void main(String[] args) {


        ArrayList<String> obj1= new ArrayList<String>();//Grand Child
        List<String> obj2= new ArrayList<String>();//Parent
        Collection<String> obj3= new ArrayList<String>();//Grand Parent
        //object  GGrand parent




        obj1.add("Student_Name");
        obj1.add("Student_Name");
        obj1.add("Student_Name");
        obj1.add("Student_Name");
        obj1.add("Ramdane");
        obj1.add("Student_Name");

        obj1.remove(4);




        for (String xyz: obj1) {
            System.out.println(xyz);

        }
        System.out.println("***********************************");
        System.out.println(obj1.size());







    }
}
