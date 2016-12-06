/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.employee;

import business.ngoWorkque.NGOWorkQueue;

/**
 *
 * @author Admin
 */
public class NGOAdministrator extends Employee{
    private NGOWorkQueue ngoWorkque;

    public NGOAdministrator(NGOWorkQueue ngoWorkque) {
        this.ngoWorkque = ngoWorkque;
    }
    
    
    
    
}
