/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise.donation;

/**
 *
 * @author Admin
 */
public class Donation {
    private int donationID;
    private static int count = 0;
    private Donor donor;
    private int donationAmount; 
    
    public Donation(Donor donor, int donationAmount){
        donationID =  ++count;
        this.donor = donor;
        this.donationAmount = donationAmount;
    }

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public int getDonationAmount() {
        return donationAmount;
    }

    public void setDonationAmount(int donationAmount) {
        this.donationAmount = donationAmount;
    }
    
    
    
}
