/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingpatternsproject;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

/**
 *
 * @author Dharmin
 */
public class Flight {
    private String flightN;
    private String name;
    private String origin;
    private String dest;
    private int duration;
    private int seats;
    private int available;
    private double amount;

    public Flight(String flightN, String name, String origin, String dest, int duration, int seats, int available, double amount) {
        this.flightN = flightN;
        this.name = name;
        this.origin = origin;
        this.dest = dest;
        this.duration = duration;
        this.seats = seats;
        this.available = available;
        this.amount = amount;
    }
//    public Flight() {
//        this.flightN = "";
//        this.name = "";
//        this.origin = "";
//        this.dest = "";
//        this.duration = 0;
//        this.seats = 1;
//        this.available = 2;
//        this.amount = 3;
//    }
        
    public String getFlightN() {
        return flightN;
    }

    public void setFlightN(String flightN) {
        this.flightN = flightN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    @Override
    public String toString() {
        return "Flight{" + "flightN=" + flightN + ", name=" + name + 
                ", origin=" + origin + ", dest=" + dest + ", duration=" +
                duration + ", seats=" + seats + ", available=" + available + 
                ", amount=" + amount + '}';
    }
}
