/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;
import business.enterprise.donation.DonationHistory;
import business.enterprise.donation.DonorDiectory;
import business.enterprise.funds.Funds;
import business.organization.Organization;
import business.organization.OrganizationDirectory;
import business.project.ProjectDirectory;
/**
 *
 * @author Admin
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private DonationHistory donationHistory;
    private DonorDiectory donorDiectory;
    private Funds funds;
    private ProjectDirectory projectDirectory;
        
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        donationHistory = new DonationHistory();
        donorDiectory = new DonorDiectory();
        funds = new Funds();
        projectDirectory = new ProjectDirectory();
    }
    
    public enum EnterpriseType{
        
        NGO("NGO");
        private String value;
        
        private EnterpriseType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
        @Override 
        public String toString(){
            return value;
        }
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public DonationHistory getDonationHistory() {
        return donationHistory;
    }

    public void setDonationHistory(DonationHistory donationHistory) {
        this.donationHistory = donationHistory;
    }

    public DonorDiectory getDonorDiectory() {
        return donorDiectory;
    }

    public void setDonorDiectory(DonorDiectory donorDiectory) {
        this.donorDiectory = donorDiectory;
    }

    public Funds getFunds() {
        return funds;
    }

    public void setFunds(Funds funds) {
        this.funds = funds;
    }

    public ProjectDirectory getProjectDirectory() {
        return projectDirectory;
    }

    public void setProjectDirectory(ProjectDirectory projectDirectory) {
        this.projectDirectory = projectDirectory;
    }
    
    
}
