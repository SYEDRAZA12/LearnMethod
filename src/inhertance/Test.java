package inhertance;

public class Test {

    public static void main(String[] args) {
        Federal fd = new Federal();
        Proverncial pr = new Proverncial();
        Edmonton ed = new Edmonton();
        Calgary cl = new Calgary();


        fd.aboriginalLaws="Yes Feds Provide Aboriginal Laws";
        System.out.println(fd.aboriginalLaws);
        fd.nationSecurity();


        pr.aboriginalLaws="Provence Implements fedral Aboriginal Laws";
        System.out.println(pr.aboriginalLaws);
        System.out.println(fd.aboriginalLaws);

        pr.education="Provence is responsible for Education";
        System.out.println(pr.education);
        pr.nationSecurity();
        pr.health();



        ed.policing();
        ed.health();
        cl.covidLaws();



    }





}
