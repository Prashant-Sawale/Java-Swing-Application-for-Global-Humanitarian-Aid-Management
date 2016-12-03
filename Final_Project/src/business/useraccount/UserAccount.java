/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.useraccount;

import business.employee.Employee;
import business.roles.Role;
import business.volunteer.Volunteer;

/**
 *
 * @author Admin
 */
public class UserAccount {
    private String username;
    private String password;
    private Employee employee;
    private Volunteer volunteer;
    private Role role;
    

    public UserAccount() {
        
    }
       
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }    
    
    @Override
    public String toString() {
        return username;
    }
}
