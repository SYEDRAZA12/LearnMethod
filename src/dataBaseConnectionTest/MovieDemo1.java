package dataBaseConnectionTest;

import java.sql.*;
import java.util.ArrayList;

public class MovieDemo1 {

    public static void main(String[] args) throws Exception{

        String url = "jdbc:mysql://localhost:3306/pntraza1?serverTimezone=UTC";
        String user = "root";
        String password = "MMNBBV14";

        Connection connection = null;
        Statement statement = null;

        Movie1 titanic = new Movie1(5, "Titanic", 1997, "Romance", "PG-13");
        Movie1 grudge = new Movie1(6, "Grudge", 2003, "Horror", "PG-13");
        Movie1 inception = new Movie1(7, "Inception", 2010, "Thriller", "PG-13");
        Movie1 fatPizza = new Movie1(9, "fatPizza", 2021, "Thriller", "PG-13");


        ArrayList<Movie1> movie = new ArrayList<>();
        movie.add(titanic);
        movie.add(grudge);
        movie.add(inception);
        movie.add(fatPizza);
        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            for (Movie1 mv : movie) {

                String query = "insert into movie(id, title, release_year, genre, mpaa_rating) " +
                        "   values(" + mv.getId() + ",'" + mv.getTitle() + "'," + mv.getReleaseYear()
                        + ",'" + mv.getGenre() + "','" + mv.getMpaaRating() + "')      ";

                statement.execute(query);


            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(" Exception Handling");

        } finally {
            statement.close();
            connection.close();
        }

    }
}
