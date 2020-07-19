package oop2;

import java.sql.SQLOutput;

public abstract class Shape {

    Shape(){
        System.out.println("This is Shape Constructor ");
    }
    int color;

    public abstract void drawing();

    public void fill() {
        System.out.println("Shape is filing");

    }

}
