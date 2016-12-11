/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise.funds;

import business.project.Project;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Funds {
    private int totalFundsAvailable;
    private ArrayList<FundAllocation> fundsDistributionHistory;

    public int getTotalFundsAvailable() {
        return totalFundsAvailable;
    }
    
    public ArrayList<FundAllocation> getFundsDistributionHistory() {
        return fundsDistributionHistory;
    }

    public void setFundsDistributionHistory(ArrayList<FundAllocation> fundsDistributionHistory) {
        this.fundsDistributionHistory = fundsDistributionHistory;
    }
    
    public FundAllocation createFundAllocation(Project project, double fundsAllocated){
        FundAllocation fd =  new FundAllocation(project, fundsAllocated);
        this.fundsDistributionHistory.add(fd);
        this.totalFundsAvailable -= fundsAllocated; 
        return fd;
    }
    
    public void addFunds(int donationAmount){
        this.totalFundsAvailable += donationAmount;       
    }
    
    
    
}
