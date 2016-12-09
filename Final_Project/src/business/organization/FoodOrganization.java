/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.roles.NgoAccountantRole;
import business.roles.NgoAdminRole;
import business.roles.NgoChefRole;
import business.roles.NgoTeacherRole;
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
    public ArrayList<Role> getSupportedEmployeeRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NgoAdminRole());
        roles.add(new NgoAccountantRole());
        return roles;
    }
    @Override
    public ArrayList<Role> getSupportedVolunteerRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NgoAdminRole());
        roles.add(new NgoChefRole());
        return roles;
    }
    
}
