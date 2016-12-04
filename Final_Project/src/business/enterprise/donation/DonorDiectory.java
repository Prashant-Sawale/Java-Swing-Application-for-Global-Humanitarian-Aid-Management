/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise.donation;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class DonorDiectory {
    private ArrayList<Donor> donorDirectory;

    public ArrayList<Donor> getDonorDirectory() {
        return donorDirectory;
    }

    public void setDonorDirectory(ArrayList<Donor> donorDirectory) {
        this.donorDirectory = donorDirectory;
    }
    
    public Donor createDonor(String name, String address, Date dob, boolean maleSex){
        Donor d = new Donor(name, address, dob, maleSex);
        donorDirectory.add(d);
        return d;
    }
    
}
