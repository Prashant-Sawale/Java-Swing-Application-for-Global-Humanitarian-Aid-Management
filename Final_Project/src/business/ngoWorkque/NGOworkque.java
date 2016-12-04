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
public class NGOworkque {

    private ArrayList<NGOworkRequest> NGOworkquRequests;
    private Project project;

    public NGOworkque() {
        this.NGOworkquRequests = new ArrayList<>();

    }

    public ArrayList<NGOworkRequest> getNGOworkquRequests() {
        return NGOworkquRequests;
    }

    public void setNGOworkquRequests(ArrayList<NGOworkRequest> NGOworkquRequests) {
        this.NGOworkquRequests = NGOworkquRequests;
    }

    
    
    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

}
