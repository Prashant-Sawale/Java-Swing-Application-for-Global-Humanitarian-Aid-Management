/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.ngoWorkque;

import business.useraccount.UserAccount;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NGOworkRequest {

    private String message;
    private UserAccount sender;
    private List<UserAccount> recieverList;

    public NGOworkRequest() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public List<UserAccount> getRecieverList() {
        return recieverList;
    }

    public void setRecieverList(List<UserAccount> recieverList) {
        this.recieverList = recieverList;
    }

    

}
