/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise.donation;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Donor {
    private int donorID;
    private String name;
    private String address;
    private Date dob;
    private boolean maleSex;
    private static int counter = 0;
        
    public Donor(String name, String address, Date dob, boolean maleSex){
        donorID = ++counter;
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.maleSex = maleSex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public boolean isMaleSex() {
        return maleSex;
    }

    public void setMaleSex(boolean maleSex) {
        this.maleSex = maleSex;
    }

    
    @Override
    public String toString(){
        return this.name;
    }
    
}
