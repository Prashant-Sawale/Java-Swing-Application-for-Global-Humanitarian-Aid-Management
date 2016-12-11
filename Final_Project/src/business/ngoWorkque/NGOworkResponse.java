/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.ngoWorkque;

import business.enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class NGOworkResponse {

    private String message;
    private Enterprise sender;
    private ArrayList<Enterprise> recieverList;

    public NGOworkResponse() {
    
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

   

}
