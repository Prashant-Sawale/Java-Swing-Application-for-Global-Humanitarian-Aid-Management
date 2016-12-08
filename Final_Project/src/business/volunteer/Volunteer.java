/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.volunteer;

import business.project.Project;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Volunteer {
    private int volunteerID;

    public int getVolunteerID() {
        return volunteerID;
    }

    public void setVolunteerID(int volunteerID) {
        this.volunteerID = volunteerID;
    }
    private static int count = 0;
    private String Name;
    private String Address;
    private Date dob;
    private boolean isAvailable=false;
    private double contactNumber;
    private String volunteerRole;
    private ArrayList<Project> projectHistory;
    
    public enum VolunteerRoleType{
        Chef, Doctor, Teacher, Worker;
    }
    
    public Volunteer(String Name,String Address,Date dob, double contactNumber, VolunteerRoleType roleType){
        volunteerID = ++count;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public double getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(double contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getVolunteerRole() {
        return volunteerRole;
    }

    public void setVolunteerRole(String volunteerRole) {
        this.volunteerRole = volunteerRole;
    }

    public ArrayList<Project> getProjectHistory() {
        return projectHistory;
    }

    public void setProjectHistory(ArrayList<Project> projectHistory) {
        this.projectHistory = projectHistory;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    
    
    @Override
    public String toString(){
        return this.Name;
    }
    
}
