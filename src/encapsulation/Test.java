package encapsulation;

public class Test {
    public static void main(String[] args) {


        Pizza ramdanePizza = new Pizza();//Default Constructor
        String rdp= ramdanePizza.pizzaName= "Tandoori";
        System.out.println("Ramdane love to eat "+ rdp+" "+ "Pizza");

        Pizza aroooshPizza = new Pizza("Chicken + Grean Paper", 40.888);
        Pizza iramPizza = new Pizza("Donair", 33.333,"cheese");

        ramdanePizza.setSauceTypw("Tomato");
        ramdanePizza.setAvailable(true);
        ramdanePizza.setPizzaType("Cheese");
        ramdanePizza.setSize('L');

        System.out.println("Ramdanae like to eat"+ramdanePizza.getSauceTypw()+ramdanePizza.isAvailable()+ramdanePizza.getPizzaType());










    }


}
