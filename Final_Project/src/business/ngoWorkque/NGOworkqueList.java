/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.ngoWorkque;


import business.project.Project;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class NGOworkqueList {

    private ArrayList<NGOworkque> NGOworkques;

    public NGOworkqueList() {

    }

    public ArrayList<NGOworkque> getNGOworkques() {
        return NGOworkques;
    }

    public void setNGOworkques(ArrayList<NGOworkque> NGOworkques) {
        this.NGOworkques = NGOworkques;
    }

    /**
     * createWorkQue method gets project as a parameter creates a work queue
     * object and sets the project to it
     */
    private NGOworkque createWorkQue(Project project) {
        NGOworkque ngoWorkque = new NGOworkque();
        ngoWorkque.setProject(project);
        return ngoWorkque;
    }
}
