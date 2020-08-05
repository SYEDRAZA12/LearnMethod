package singleton;

public class TestSingleton {
    public static void main(String[] args) {

        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();

        obj.address = "Canada";
        System.out.println(obj.address);

        obj1.address = "USA";
        System.out.println(obj1.address);

        System.out.println("=========================");

        System.out.println(obj.address);
        System.out.println(obj1.address);

        obj.setDOB("19997");
        obj1.setSin("asfasdfadsfasdf");
        System.out.println(obj.getDOB());
        System.out.println(obj.getSin());


        /**    Singleton sn = new Singleton();
         Singleton sn1 = new Singleton();

         sn.address="new York";
         System.out.println(sn.address);
         sn1.address="Edmonton";
         System.out.println(sn1.address);

         System.out.println("======================");


         System.out.println(sn.address);
         System.out.println(sn1.address);*/


    }

}


