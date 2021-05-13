/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingpatternsproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dharmin
 */
class DatabaseConnection {

    private static Connection connect;

    public static Connection getInstance() {
        if (connect == null) {
            connect = createConnection();
        }
        return connect;
    }  // Singleton Design pattern

    private static Connection createConnection() {
        String dbUrl = "jdbc:sqlite:src\\db\\LFRS_db.db";
        Connection c = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection(dbUrl);
            System.out.println("Opened database successfully");

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return c;
    }
}
