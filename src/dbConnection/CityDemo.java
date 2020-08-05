package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

public class CityDemo {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/PNTRAZA3?serverTimezone=UTC";
        String user = "root";
        String password = "MMNBBV14";

        Connection connection=null;
        Statement statement=null;

        Cities newYork = new Cities("001", "New York", "10M", "2000");
        Cities vancouver = new Cities("777", "vancouver", "3M", "500");
        Cities edmonton = new Cities("003", "Edmonton", "1M", "8");
        Cities toronto = new Cities("006", "Toronto", "8M", "1500");

        System.out.println(vancouver.getPopulation());
        System.out.println(toronto.getPopulation());

        ArrayList<Cities> cities = new ArrayList<>();
        cities.add(newYork);
        cities.add(edmonton);
        cities.add(vancouver);
        cities.add(toronto);

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            for (Cities ct : cities) {

                String query = "insert into cities(cityid, cityName, population, noOfSchools) " +
                           "values('" +ct.getCityid() + "','" + ct.getCityName()+ "','" + ct.getPopulation()
                        + "','" + ct.getNoOfSchools() + "')      ";
                System.out.println(query);

                //String query = "update cities set cityName = 'VERGINIA'   where cityid = 3";

               statement.execute(query);

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(" Exception is being handled");
        } finally {


            statement.close();
            connection.close();

            //VARCHAR 'NEWYORK'
            //String "Newyork"


        }


    }


}
