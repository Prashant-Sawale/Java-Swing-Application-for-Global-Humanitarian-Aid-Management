/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.roles.Role;
import business.roles.AdminRole;
import business.roles.TeacherRole;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class EducationOrganization extends Organization {
    public EducationOrganization() {
        super(Type.Education.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdminRole());
        roles.add(new TeacherRole());
        return roles;
    }
    
}
