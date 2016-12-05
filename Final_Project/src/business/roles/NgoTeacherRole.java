/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.roles;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.EducationOrganization;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.teacher.TeacherWorkareaJPanel;

/**
 *
 * @author Admin
 */
public class NgoTeacherRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        //return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
    return new TeacherWorkareaJPanel(userProcessContainer,account,(EducationOrganization)organization,enterprise);
    }
    
}
