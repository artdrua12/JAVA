package main.homework.lesson30.singlton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Singlton {

    private Connection conn;
    private static Singlton instance;

    private Singlton() throws ClassNotFoundException, SQLException {
        final String url = "jdbc:mysql://localhost:3306/";
        final String username = "root";
        final String password = "1234567";
        conn = DriverManager.getConnection(url, username, password);
        System.out.println("Connected to database");
    }

    public static Singlton getInstance() throws SQLException, ClassNotFoundException {
        if (instance == null) {
            return instance = new Singlton();
        }
        return instance;
    }

    public Connection getConnection() {
        return conn;
    }

}
