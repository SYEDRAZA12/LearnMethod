package OOP11;

public abstract class Finance implements USBank,CBCBank{

    int equity = 2000;

    public abstract void minHR();
    public void minBranches(){
        System.out.println("Banks Minimum Branches should be 5 per City");
    }
}
