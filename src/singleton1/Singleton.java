package singleton1;

// Singleton class: we are allowed to create one instance of a class at a time.
// Using private constructor we can ensure that no more than one object can be created at a time.

public class Singleton {

    int age;
    String name;
    String add;

    private Singleton() {

    }

    private static Singleton instance = new Singleton();


    public static Singleton getInstance() {


        return instance;
    }


}