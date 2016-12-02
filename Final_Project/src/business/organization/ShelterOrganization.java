/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.roles.AdminRole;
import business.roles.Role;
import business.roles.WorkerRole;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ShelterOrganization extends Organization{
    public ShelterOrganization() {
        super(Type.Shelter.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdminRole());
        roles.add(new WorkerRole());
        return roles;
    }
}
