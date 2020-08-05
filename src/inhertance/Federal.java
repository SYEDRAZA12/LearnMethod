package inhertance;

public class Federal {


    private static int numberSecurity;

    public String criminalLaws;
    public String aboriginalLaws;
    public String incomeTaxes;

    public void nationSecurity(){
        System.out.println("Federal Government is responsible for National Security");
    }

    private static void membersSecurity(){
        System.out.println("Federal Government is responsible for members Security");
    }

    public static void main(String[] args) {
        membersSecurity();
        numberSecurity = 5;
    }
}
