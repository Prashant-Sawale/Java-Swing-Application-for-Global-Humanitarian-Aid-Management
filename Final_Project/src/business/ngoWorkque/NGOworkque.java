/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.ngoWorkque;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class NGOworkque {

    private ArrayList<NGOworkque> NGOworkqueList;

    public NGOworkque() {
        this.NGOworkqueList = new ArrayList<>();
    }

    public ArrayList<NGOworkque> getNGOworkqueList() {
        return NGOworkqueList;
    }

    public void setNGOworkqueList(ArrayList<NGOworkque> NGOworkqueList) {
        this.NGOworkqueList = NGOworkqueList;
    }

}
