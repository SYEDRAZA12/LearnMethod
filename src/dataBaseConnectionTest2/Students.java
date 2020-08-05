package dataBaseConnectionTest2;

public class Students {
    private int id;
    private String fristName ;
    private String lastName;
    private char grade;

    public int getId() {
        return id;
    }

    public String getFristName() {
        return fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getGrade() {
        return grade;
    }

    public Students(int id, String fristName, String lastName, char grade) {
        this.id = id;
        this.fristName = fristName;
        this.lastName = lastName;
        this.grade = grade;
    }



}
