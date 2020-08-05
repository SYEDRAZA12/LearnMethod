package encapsulation;

public class Pizza {

    public String pizzaName="Pizza 73";
    public double pizzaPrice = 14.600;

    private String pizzaType= "Meat lover";
    private String sauceTypw= "ketchup";
    private String topping= "chicken";
    private char size= 'M';
    private boolean isAvailable;


    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public String getSauceTypw() {
        return sauceTypw;
    }

    public void setSauceTypw(String sauceTypw) {
        this.sauceTypw = sauceTypw;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Pizza() {
    }

    public Pizza(String pizzaNamw, double pizzaPrice) {
        this.pizzaName = pizzaNamw;
        this.pizzaPrice = pizzaPrice;
        System.out.println("Aroosh love to eat "+this.pizzaName);
        System.out.println("Aroosh love to eat "+this.pizzaPrice);
    }

    public Pizza(String pizzaNamw, double pizzaPrice, String pizzaType) {
        this.pizzaName = pizzaNamw;
        this.pizzaPrice = pizzaPrice;
        this.pizzaType = pizzaType;
        System.out.println("Iram love to eat "+ pizzaNamw+"Pizza Price  "+pizzaPrice+"Pizza Type is "+pizzaType);
    }

    public Pizza(String pizzaType, String sauceTypw, String topping, char size) {
        this.pizzaType = pizzaType;
        this.sauceTypw = sauceTypw;
        this.topping = topping;
        this.size = size;
    }
}
