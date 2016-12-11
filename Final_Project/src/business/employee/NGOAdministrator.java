/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.employee;

import business.ngoWorkque.WorkRequest;

/**
 *
 * @author Admin
 */
public class NGOAdministrator extends Employee{
    private WorkRequest ngoWorkque;

    public NGOAdministrator(WorkRequest ngoWorkque) {
        this.ngoWorkque = ngoWorkque;
    }
    
    
    
    
}
