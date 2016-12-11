/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.ngoWorkque;

import business.enterprise.Enterprise;
import business.useraccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class WorkResponse {

    private String message;
    private Enterprise sender;
    private ArrayList<Enterprise> recieverList;

    public WorkResponse() {
    
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

   

}
