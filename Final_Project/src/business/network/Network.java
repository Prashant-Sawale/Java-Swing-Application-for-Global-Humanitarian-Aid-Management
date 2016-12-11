/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.network;

import business.enterprise.EnterpriseDirectory;

import business.ngoWorkque.NGOWorkRequestList;

/**
 *
 * @author Admin
 */
public class Network {

    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private NGOWorkRequestList ngoWorkqueList;

    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
        ngoWorkqueList = new NGOWorkRequestList();

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
    public String toString() {
        return name;
    }
}
