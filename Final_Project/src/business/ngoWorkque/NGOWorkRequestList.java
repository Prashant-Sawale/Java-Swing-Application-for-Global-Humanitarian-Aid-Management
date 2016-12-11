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
public class NGOWorkRequestList {

    private ArrayList<NGOWorkRequest> ngoWorkRequests;

    public NGOWorkRequestList() {
        ngoWorkRequests  = new ArrayList<>();
    }

    public ArrayList<NGOWorkRequest> getNgoWorkRequests() {
        return ngoWorkRequests;
    }

    public void setNgoWorkRequests(ArrayList<NGOWorkRequest> ngoWorkRequests) {
        this.ngoWorkRequests = ngoWorkRequests;
    }

    /**
     * createWorkRequest method gets project as a parameter creates a work queue
 object and sets the project to it
     */
    private NGOWorkRequest createWorkRequest(Project project) {
        NGOWorkRequest ngoWorkque = new NGOWorkRequest(project);
        return ngoWorkque;
    }
}
