/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.roles.NgoAdminRole;
import business.roles.NgoDoctorRole;
import business.roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class MedicationOrganization extends  Organization{
    public MedicationOrganization() {
        super(Type.Medical.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NgoAdminRole());
        roles.add(new NgoDoctorRole());
        return roles;
    }
}
