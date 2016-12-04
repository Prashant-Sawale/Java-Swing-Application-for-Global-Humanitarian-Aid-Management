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

    private ArrayList<NGOworkque> NGOworkqueList;
    private Project project;

    public NGOworkque() {
        this.NGOworkqueList = new ArrayList<>();

    }

    public ArrayList<NGOworkque> getNGOworkqueList() {
        return NGOworkqueList;
    }

    public void setNGOworkqueList(ArrayList<NGOworkque> NGOworkqueList) {
        this.NGOworkqueList = NGOworkqueList;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

}
