/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.network;

import business.enterprise.EnterpriseDirectory;
import business.enterprise.project.Project;
import business.ngoWorkque.NGOworkque;
import business.ngoWorkque.NGOworkqueList;

/**
 *
 * @author Admin
 */
public class Network {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private NGOworkqueList ngoWorkqueList;
    //private NGOworkque nGOworkque;

    public Network(){
        enterpriseDirectory = new EnterpriseDirectory();
        ngoWorkqueList=new NGOworkqueList();
        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
