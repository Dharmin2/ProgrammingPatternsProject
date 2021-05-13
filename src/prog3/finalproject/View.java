/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog3.finalproject;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Dharmin
 */
public class View {

    public View() {
    }

    public String[][] printFlightsTable(ResultSet resultSet) throws SQLException {
        int count = 0;
        String[][] flights = new String[8][];
        while (resultSet.next()) {
            String getFlightN = resultSet.getString("flightN");
            String getName = resultSet.getString("Name");
            String getOrigin = resultSet.getString("Origin");
            String getDest = resultSet.getString("Dest");
            Integer getDuration = resultSet.getInt("Dest");
            Integer getSeats = resultSet.getInt("Duration");
            Integer getAvailable = resultSet.getInt("Available");
            Double getAmount = resultSet.getDouble("Amount");

            flights[0][count] = getFlightN;
            flights[1][count] = getName;
            flights[2][count] = getOrigin;
            flights[3][count] = getDest;
            flights[4][count] = getDuration.toString();
            flights[5][count] = getSeats.toString();
            flights[6][count] = getAvailable.toString();
            flights[7][count] = getAmount.toString();
//            System.out.println("Flight Number: " + getFlightN);
//            System.out.println("Name: " + getName);
//            System.out.println("Origin: " + getOrigin);
//            System.out.println("Destination: " + getDest);
//            System.out.println("Duration: " + getDuration);
//            System.out.println("Total Seats: " + getSeats);
//            System.out.println("Available Seats " + getAvailable);
//            System.out.println("Amount: " + getAmount);
            count++;
        }
        return flights;
    }

    public void printClientTable(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            String getName = resultSet.getString("FLname");
            int getPassNum = resultSet.getInt("PassNum");
            String getContact = resultSet.getString("Contact");

            System.out.println("Full Name: " + getName);
            System.out.println("Passport Number: " + getPassNum);
            System.out.println("Contact: " + getContact);
        }
    }

    public void printReserveddFlights(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            String getTicketN = resultSet.getString("ticketN");
            String getflightN = resultSet.getString("flightN");
            int getPassNum = resultSet.getInt("PassNum");
            String getFLName = resultSet.getString("FLName");
            Date getIssueDate = resultSet.getDate("IssueDate");
            String getContact = resultSet.getString("Contact");
            double getAmount = resultSet.getDouble("Amount");

            System.out.println("Ticket Number: " + getTicketN);
            System.out.println("Flight Nubmer: " + getflightN);
            System.out.println("Passport Number: " + getPassNum);
            System.out.println("Full Name: " + getFLName);
            System.out.println("Issue Date: " + getIssueDate);
            System.out.println("Contact: " + getContact);
            System.out.println("Amount: " + getAmount);
        }
    }
    
}
