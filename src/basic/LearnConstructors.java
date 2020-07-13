package basic;

public class LearnConstructors {
    int age;
    String name;
    double fee;
    String address;

    public LearnConstructors() {
        System.out.println("This is my default constructor");

    }

    public LearnConstructors(String address) {
        System.out.println("This is my first perameter constructor");
        System.out.println(address);
        this.address=address;
        System.out.println("this one has value of global veriable"+ this.address);
        address="USA";
        System.out.println(address);

    }

    public static void main(String[] args) {

        LearnConstructors obj = new LearnConstructors();
        LearnConstructors obj1 = new LearnConstructors("Canada");


    }
}
