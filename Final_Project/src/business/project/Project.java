/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.project;

import business.enterprise.funds.FundAllocation;
import business.volunteer.Volunteer;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Project {
    private int projectID;
    private String projectName;
    private static int count = 0;
    private ArrayList<FundAllocation> projectFunds;
    private ArrayList<Volunteer> volunteers;
    
    public Project(String projectName) {
        projectID = ++count;
        this.projectName = projectName;
        projectFunds = new ArrayList<FundAllocation>();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    
    public void addFundAllocation(FundAllocation fa){
        projectFunds.add(fa);
    }
    
    public void removeFundAllocation(FundAllocation fa){
        projectFunds.remove(fa);
    }
    
    public void addVolunteer(Volunteer v){
        volunteers.add(v);
    }
    
    public void removeVolunteer(Volunteer v){
        volunteers.remove(v);
    }
    
}
