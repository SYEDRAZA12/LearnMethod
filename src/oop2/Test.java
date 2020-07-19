package oop2;

public class Test extends Shape {
    Test() {
        System.out.println("This is Test Class Constrctor");
    }

    public static void main(String[] args) {
        //Test test = new Test();
         Shape s = new Test();

//        s.fill();
//        s.drawing();
    }

    @Override
    public void drawing() {
        System.out.println("this abstract method ");

    }
}
