/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingpatternsproject;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Dharmin
 */
public class Client {
    private String fullName;
    private int passNumber;
    private int contact;

    public Client(String fullName, int passNumber, int contact) {
        this.fullName = fullName;
        this.passNumber = passNumber;
        this.contact = contact;
    }
    
    public Client() {
        this.fullName = "";
        this.passNumber = 0;
        this.contact = 0;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPassNumber() {
        return passNumber;
    }

    public void setPassNumber(int passNumber) {
        this.passNumber = passNumber;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }
    
}
