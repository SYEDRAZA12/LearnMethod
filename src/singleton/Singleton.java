package singleton;

public class Singleton {
    int age;
    String name;
    String address;
    private String sin = "asdfasdfasdfasdf";
    private String DOB = "1979-11-12";


    private Singleton() {

    }


    private static Singleton instance = new Singleton();


    public static Singleton getInstance() {

        return instance;
    }

    public String getSin() {
        return sin;
    }

    public void setSin(String sin) {
        this.sin = sin;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

}
