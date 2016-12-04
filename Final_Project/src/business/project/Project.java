/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.project;

import business.enterprise.funds.FundAllocation;
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
        this.projectFunds.add(fa);
    }
    
    public void removeFundAllocation(FundAllocation fa){
        this.projectFunds.remove(fa);
    }
    
}
