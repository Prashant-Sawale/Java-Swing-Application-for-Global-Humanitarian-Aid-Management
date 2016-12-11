/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.employee;

import business.ngoWorkque.NGOWorkRequest;

/**
 * This class defines the enterprise administrator.
 *
 * @author Admin
 */
public class NGOAdministrator extends Employee {

    private NGOWorkRequest ngoWorkque;

    public NGOAdministrator(NGOWorkRequest ngoWorkque) {
        this.ngoWorkque = ngoWorkque;
    }

}
