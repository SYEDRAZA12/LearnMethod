package dataBaseConnectionTest2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

public class TestStudent {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/pntraza2?serverTimezone=UTC";
        String user = "root";
        String password = "MMNBBV14";
        Connection connection = null;
        Statement statement = null;

        Students shakir = new Students(001,"Shakir", "abc",'A');
        Students joney = new Students(002,"joney", "def",'C');
        Students mobin = new Students(003,"mobin", "ghi",'D');
        Students ramdane = new Students(004,"ramdane", "jkl",'F');

        ArrayList<Students> students = new ArrayList<>();
        students.add(shakir);
        students.add(joney);
        students.add(mobin);
        students.add(ramdane);

        try{
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            for (Students stu:students) {
                String query = "insert into Students(id, fristName, lastName, grade) " +
                        "   values(" + stu.getId() + ",'" + stu.getFristName() + "'," + stu.getLastName()
                        + ",'" + stu.getGrade() +  "')      ";
                statement.execute(query);

            }




        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            statement.close();
            connection.close();
        }




    }
}
