/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingpatternsproject;

import java.sql.SQLException;
import java.sql.Statement;
import programmingpatternsproject.Client;
import programmingpatternsproject.Flight;

/**
 *
 * @author Dharmin
 */
public class Controller {

    Flight flight;
    private Client client;
    private View view;

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
//    public List<Flight> searchFlightByDest(String dest) {
//        
//    }
//    
//    public List<Flight> searchFlightByDuration(int d) {
//        
//    }
//    
//    public List<Flight> searchFlightByOrigin(String origin) {
//        
//    }
//    
//    public Map<String, String> viewsFlightsBoard() {
//        
//    }
    public boolean addFlight(Flight F) throws SQLException {
        //if (flight.getAvailable() > 0) {
            try {
                Statement stmt = DatabaseConnection.getInstance().getConnection().createStatement();
                String addFlight = "Insert into Flights "
                        + "Values (" + flight.getFlightN() + "," + flight.getName() + "," + flight.getOrigin() + "," + flight.getDest()
                        + "," + flight.getDuration() + "," + flight.getSeats() + "," + flight.getAvailable() + "," + flight.getAmount() + ")";
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

    public boolean removeFlight(Flight flightN) {
        //if (flight.getAvailable() > 0) {
        try {
            Statement stmt = DatabaseConnection.getInstance().getConnection().createStatement();
            String addFlight = "Delete from ";
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
//    
//    public boolean updateFlightData(String flightN, String field, String newValue) {
//        
//    }
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
