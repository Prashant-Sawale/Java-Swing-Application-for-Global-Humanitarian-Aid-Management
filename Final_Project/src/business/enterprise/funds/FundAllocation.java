/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise.funds;

import business.project.Project;

/**
 *
 * @author Admin
 */
public class FundAllocation {
    private int fundDistributionID;
    private static int count = 0;
    private Project project; 
    private int fundsAllocated;
    
    public FundAllocation(Project project, int fundsAllocated){
        fundDistributionID = ++count;
        this.project = project;
        this.fundsAllocated = fundsAllocated;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public int getFundsAllocated() {
        return fundsAllocated;
    }

    public void setFundsAllocated(int fundsAllocated) {
        this.fundsAllocated = fundsAllocated;
    }
    
    
    
}
