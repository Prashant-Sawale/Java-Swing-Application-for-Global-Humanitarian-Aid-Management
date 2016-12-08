/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.volunteer;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class VolunteerDirectory {
    private ArrayList<Volunteer> volunteers;

    public ArrayList<Volunteer> getVolunteers() {
        return volunteers;
    }

    public void setVolunteers(ArrayList<Volunteer> volunteers) {
        this.volunteers = volunteers;
    }
    
    public Volunteer createVolunteer(String Name,String Address, double contactNumber){
        Volunteer v = new Volunteer(Name,Address,contactNumber);
        volunteers.add(v);
        return v;
    }
    
    public void removeVolunteer(Volunteer v){
        volunteers.remove(v);
    }
    
}
