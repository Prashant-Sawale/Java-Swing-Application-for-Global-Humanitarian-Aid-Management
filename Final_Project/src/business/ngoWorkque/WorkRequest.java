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
public class WorkRequest {

    private ArrayList<WorkResponse> NGOworkquResponses;
    private Project project;

    public WorkRequest(Project project) {
        this.project = project;
        this.NGOworkquResponses = new ArrayList<>();

    }

    public ArrayList<WorkResponse> getNGOworkquResponses() {
        return NGOworkquResponses;
    }

    public void setNGOworkquResponses(ArrayList<WorkResponse> NGOworkquResponses) {
        this.NGOworkquResponses = NGOworkquResponses;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

}
