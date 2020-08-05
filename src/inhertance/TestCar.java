package inhertance;

import java.sql.SQLOutput;

public class TestCar {

//        1. compile-time polymorphism/ (method overloading)/ static binding
//        2. runtime polymorphism /(method overriding)/ Dynamic binding


    public static void main(String[] args) {
        BMW bmw = new BMW();//compile-time polymorphism/ (method overloading)/ static binding
        bmw.start();
        bmw.stop();
        bmw.reFuel();
        bmw.theftSafety();
        bmw.engine();
        System.out.println("=======================");

        Car car = new Car();

        car.start();
        car.engine();
        System.out.println("=======================");


        Car car1 = new BMW();// top casting or dynamic polymorphism or runtime polymorphism

        car1.start();
        car1.engine();
        System.out.println("=======================");


        Vehicle v = new Vehicle();
        v.engine();

        System.out.println("=======================");

        Vehicle v1 = new Car();

        v1.engine();

        System.out.println("=======================");

        //BMW b2= (BMW)new Car();

















    }
}
