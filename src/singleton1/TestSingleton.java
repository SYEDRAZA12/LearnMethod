package singleton1;

import jdk.swing.interop.SwingInterOpUtils;

public class TestSingleton {


    public static void main(String[] args) {


        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        obj.age = 18;
        obj.add = "CANADA";
        System.out.println(obj.add);
        System.out.println(obj.age);

        System.out.println("========================");
        obj1.age = 45;
        obj1.add = "USA";
        System.out.println(obj1.add);
        System.out.println(obj1.age);

        System.out.println("========================");

        System.out.println(obj.add);
        System.out.println(obj.age);


        System.out.println("========================");


        System.out.println(obj3.add);



    }


}
