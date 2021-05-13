/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingpatternsproject;

import java.sql.*;

/**
 *
 * @author Dharmin
 */
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

//        Connection c = null;
//        try {
//            Class.forName("org.sqlite.JDBC");
//            c = DatabaseConnection.getInstance().getConnection();
//            String selectAll = "Select * from Flights";
//            Statement stmt = c.createStatement();
//            ResultSet rs = stmt.executeQuery(selectAll);
//            
//            while (rs.next()) {
//                int getId = rs.getInt("flightN");
//                System.out.println("Flight Number: " + getId);
//            }
//            
////            c = DriverManager.getConnection("jdbc:sqlite:..\\db\\LFRS_db.db");
//        } catch (Exception ex) {
//            System.err.println(ex.getClass().getName() + ": " + ex.getMessage());
//            System.exit(0);
//        }
        //Flight flight = new Flight();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Flight Number");
//        if (scanner.hasNextLine()) {
//            String flightNumber = scanner.nextLine();
//            System.out.println(flightNumber);
//        }
//        System.out.println("Enter name");
//        if (scanner.hasNextLine()) {
//            String name = scanner.nextLine();
//            System.out.println(name);
//        }
//        if (scanner.hasNextLine()) {
//            String origin = scanner.nextLine();
//            System.out.println(origin);
//        }
//        if (scanner.hasNextLine()) {
//            String dest = scanner.nextLine(); //Add other 4 values
//            System.out.println(dest);
//        }
        
        Flight flight2 = new Flight("FlightNumber", "Name", "Origin", "Dest", 10, 20, 15, 100.00);
        Client client = new Client();
        View view = new View();
        Controller controller = new Controller(flight2, client, view);
        //Map<String, String> map = controller.getAllFlights();
        
        //controller.removeFlight("flightN2");

//        for (String name : map.keySet()) {
//            String key = name;
//            String value = map.get(name);
//            System.out.println(key + " " + value);
//        }
            //controller.addFlight(flight2);

    }
}
//        this.flightN = flightN;
//        this.name = name;
//        this.origin = origin;
//        this.dest = dest;
//        this.duration = duration;
//        this.seats = seats;
//        this.available = available;
//        this.amount = amount;