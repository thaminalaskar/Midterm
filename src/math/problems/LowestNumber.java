package math.problems;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        /*
         * Write java solution to find the lowest number from this array.
         * Use MySql Database to store and to retrieve.
         */
        int[] array = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

        //find lowest number from the array
        int n = array.length;

        int smallNumber = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i] <= smallNumber) {
                smallNumber = array[i];
            }
        }
        System.out.println("Lowest number " + smallNumber);


        String username = "root";
        String password = "root1234";
        String dbName = "midtermmath";


        String url = "jdbc:mysql://localhost:3306/" + dbName + "";

        String allData = "select * from Score;";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();

        for (int i = 26; i < n; i++) {
            String addData = "INSERT INTO Score values(" + i + ", " + array[i] + ");";
            statement.executeUpdate(addData);
        }

        ResultSet table = statement.executeQuery(allData);


        System.out.println("Data is reading from the Table (tbl_Score) and displaying to the console");

        while (table.next()) {
            int idFromDb = table.getInt(2);
            System.out.println(idFromDb);
        }


    }
}








