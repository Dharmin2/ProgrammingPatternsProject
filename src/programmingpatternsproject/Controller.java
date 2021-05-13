/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingpatternsproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import programmingpatternsproject.Client;
import programmingpatternsproject.Flight;

/**
 *
 * @author Dharmin
 */
public class Controller {

    private Flight flight;
    private Client client;
    private View view;
    private final Connection conn = DatabaseConnection.getInstance();

    public Controller(Flight flight, Client client, View view) {
        this.flight = flight;
        this.client = client;
        this.view = view;
    }

    //    public boolean bookASeat(String fn) {
//        
//    }
//    
//    public boolean cancelReservation(int ticket) {
//        
//    }
//    
    public List<Flight> searchFlightByDest(String dest) throws SQLException {
        List<Flight> flights = new ArrayList<Flight>();
        try {
            Statement stmt = conn.createStatement();
            String getFlight = "Select * from Flights where Dest = "
                    + dest;
            ResultSet rs = stmt.executeQuery(getFlight);
            stmt.close();

            while (rs.next()) {
                String getFlightN = rs.getString("flightN");
                String getName = rs.getString("Name");
                String getOrigin = rs.getString("Origin");
                String getDest = rs.getString("Dest");
                Integer getDuration = rs.getInt("Duration");
                Integer getSeats = rs.getInt("Seats");
                Integer getAvailable = rs.getInt("Avaliable");
                Integer getAmount = rs.getInt("Amount");
                flights.add(new Flight(getFlightN, getName, getOrigin, getDest, getDuration, getSeats, getAvailable, getAmount));
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return flights;
    }
//    

    public List<Flight> searchFlightByDuration(int d) {
        List<Flight> flights = new ArrayList<Flight>();
        try {
            Statement stmt = conn.createStatement();
            String getFlight = "Select * from Flights where Duration = "
                    + String.valueOf(d);;
            ResultSet rs = stmt.executeQuery(getFlight);
            stmt.close();

            while (rs.next()) {
                String getFlightN = rs.getString("flightN");
                String getName = rs.getString("Name");
                String getOrigin = rs.getString("Origin");
                String getDest = rs.getString("Dest");
                Integer getDuration = rs.getInt("Duration");
                Integer getSeats = rs.getInt("Seats");
                Integer getAvailable = rs.getInt("Avaliable");
                Integer getAmount = rs.getInt("Amount");
                flights.add(new Flight(getFlightN, getName, getOrigin, getDest, getDuration, getSeats, getAvailable, getAmount));
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return flights;
    }

    public List<Flight> searchFlightByOrigin(String origin) {
        List<Flight> flights = new ArrayList<Flight>();
        try {
            Statement stmt = conn.createStatement();
            String getFlight = "Select * from Flights where Origin = "
                    + origin;
            ResultSet rs = stmt.executeQuery(getFlight);
            stmt.close();

            while (rs.next()) {
                String getFlightN = rs.getString("flightN");
                String getName = rs.getString("Name");
                String getOrigin = rs.getString("Origin");
                String getDest = rs.getString("Dest");
                Integer getDuration = rs.getInt("Duration");
                Integer getSeats = rs.getInt("Seats");
                Integer getAvailable = rs.getInt("Avaliable");
                Integer getAmount = rs.getInt("Amount");
                flights.add(new Flight(getFlightN, getName, getOrigin, getDest, getDuration, getSeats, getAvailable, getAmount));
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return flights;
    }
//    
//    public Map<String, String> viewsFlightsBoard() {
//        
//    }

    public boolean addFlight(Flight F) throws SQLException {
        //if (flight.getAvailable() > 0) {
        try {
            Statement stmt = conn.createStatement();
//                System.out.println(flight.getAmount());
//                System.out.println(flight.getAvailable());
//                System.out.println(flight.getDest());
//                System.out.println(flight.getDuration());
//                System.out.println(flight.getFlightN());
//                System.out.println(flight.getName());
//                System.out.println(flight.getOrigin());
//                System.out.println(flight.getSeats());
            String addFlight = "Insert into Flights "
                    + "Values (" + "'" + flight.getFlightN()
                    + "','" + flight.getName()
                    + "','" + flight.getOrigin()
                    + "','" + flight.getDest()
                    + "','" + flight.getDuration()
                    + "'," + flight.getSeats()
                    + "," + flight.getAvailable()
                    + "," + flight.getAmount()
                    + ");";
            stmt.executeUpdate(addFlight);
            stmt.close();
            return true;
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        //}
        return false;
    }

    public boolean removeFlight(String flightN) {
        //if (flight.getAvailable() > 0) {
        //System.out.println("Enter Flightnumber of flight you want to remove: ");
        //Scanner scanner = new Scanner(System.in);
        //if (scanner.hasNextLine() && !scanner.nextLine().equals("")) {
//            String flightNumber = scanner.nextLine();
        try {
            Statement stmt = conn.createStatement();
            String addFlight = "Delete from Flights where flightN = '"
                    + flightN + "';";
            stmt.executeUpdate(addFlight);
            stmt.close();
            return true;
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        //}
//        //}
        return false;
    }
//    

    public boolean updateFlightData(String flightN, String field, String newValue) throws SQLException {
        try {
            Statement stmt = conn.createStatement();
            String updateFlight = "Update Flights set" + field + "=" + newValue + "where flightN = " + flightN;
            stmt.executeUpdate(updateFlight);
            stmt.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
//    
//    public boolean issueTicket(Client c) {
//        
//    }
//    
//    public boolean cancelFlight(int ticket, int passN) {
//        
//    }
//    
//    public static Map<String, String> viewBoard() {
//        
//    }
//    
//    public static Map<String, String> viewBookFlights() {
//        
//    }

    public Map<String, String> getAllFlights() throws SQLException {

        HashMap<String, String> map = new HashMap();

        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * from flights;");

            while (rs.next()) {
                //int id = rs.getInt("STUDENTID");
                String getFlightNum = rs.getString("flightN");

                String getName = rs.getString("Name");
                map.put(getFlightNum, getName);
                //System.out.println(getFlightNum);
                //map.put(rs.getInt("flightN"), " name: " + name + ", address: " + addr);

            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return map;
    }

    public void printMap(HashMap<Integer, String> map) {
        for (Integer name : map.keySet()) {
            String key = name.toString();
            String value = map.get(name).toString();
            System.out.println(key + " " + value);
        }
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

}
