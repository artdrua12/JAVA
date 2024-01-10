package main.homework.controlWork1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlUtil {

    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/operation";
    private static final String user = "root";
    private static final String password = "1234567";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public static void clearTable() {

        String query = "TRUNCATE operation.tableoperations;";
        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            stmt.executeUpdate(query);
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }

    public static String addData(String data) {

        String query = "INSERT INTO operation.tableoperations (operations) VALUES ('"
                + data + "' );";
        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            stmt.executeUpdate(query);
            return "Данные записаны в БД.";
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
            return "Ошибка записи в БД.";
        }
    }

    public static void readData() {

        String query = "select id, operations from operation.tableoperations ";
        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt(1);
                String operations = rs.getString(2);
                System.out.printf("id: %d, operations: %s %n", id, operations);
            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            // close connection ,stmt and resultset here
            try {
                con.close();
            } catch (SQLException se) {
                /* can't do anything */ }
            try {
                stmt.close();
            } catch (SQLException se) {
                /* can't do anything */ }
            try {
                rs.close();
            } catch (SQLException se) {
                /* can't do anything */ }
        }
    }

}