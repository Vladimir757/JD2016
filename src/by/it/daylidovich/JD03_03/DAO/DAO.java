package by.it.daylidovich.JD03_03.DAO;

import by.it.Xampp;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO<TYPE> {

    private static Connection connection;
    private static Statement statement;
    private static DAO dao;

    public DAO() {
        try {
            connection = Xampp.getConnection(2016);
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }

    public static Statement getStatement() {
        return statement;
    }

    static DAO getDAO() {
        if (dao == null) {
            dao = new DAO();
        }
        return dao;
    }

    static void closeDAO() {
        dao = null;
    }

    static int executeUpdate(String sql){
        int result = -1;
        try {
            result = statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
