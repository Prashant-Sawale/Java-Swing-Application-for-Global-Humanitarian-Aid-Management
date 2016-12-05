/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.roles.NgoAdminRole;
import business.roles.Role;
import business.roles.NgoWorkerRole;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class FoodOrganization extends Organization{
    public FoodOrganization() {
        super(Type.Food.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NgoAdminRole());
        roles.add(new NgoWorkerRole());
        return roles;
    }
}
