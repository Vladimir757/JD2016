package by.it.chetovich.JD03_01.DB_creation_java;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Connect_java
 */
public class Connect_java {

    public static void main(String[] args) {

        try(Connection connection = DriverManager.getConnection(CN.URL_DB, CN.USER_DB, CN.PASSWORD_DB)){
            if (!connection.isClosed())
                System.out.println("Connected");
            connection.close();
            if (connection.isClosed())
                System.out.println("Connection interrupted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
