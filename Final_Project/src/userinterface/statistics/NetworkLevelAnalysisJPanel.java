/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.statistics;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.project.Project;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author rohan
 */
public class NetworkLevelAnalysisJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form NetworkLevelAnalysisJPanel
     */
    public NetworkLevelAnalysisJPanel(JPanel userProcessContainer, EcoSystem system) {

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        getAreaWiseNumberOfOrganization();
        getAreaWiseNumberOfPeopleServed();
    }

    private void getAreaWiseNumberOfOrganization() {

        int count = 0;
        DefaultCategoryDataset barchartdata = new DefaultCategoryDataset();
        /*
        barchartdata.setValue(No of total volunteers for a given NGO, "Volunteers", "NGO1");
         */

        //  ArrayList<Integer> volunteers = new ArrayList<>();
        for (Network network : system.getNetworkList()) {

            int count1 = 10;
            if (network.getEnterpriseDirectory() != null && network.getEnterpriseDirectory().getEnterpriseList() != null && network.getEnterpriseDirectory().getEnterpriseList().size() > 0) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    count += enterprise.getOrganizationDirectory().getOrganizationList().size();
                    barchartdata.setValue(count, "Number of Organizations", network.getName());
                    count += count1 + 10;
                }
            }
        }

        JFreeChart barchart = ChartFactory.createBarChart("Number of Organizations in each Network", "In year 2016", "Organizations", barchartdata, PlotOrientation.VERTICAL, false, true, false);
        //       CategoryPlot barchrt = (CategoryPlot) barchart.getPlot();

        ChartPanel barchartPanel = new ChartPanel(barchart);
        noOfOrgsJPanel.removeAll();
        noOfOrgsJPanel.add(barchartPanel);
        noOfOrgsJPanel.validate();
    }

    private void getAreaWiseNumberOfPeopleServed() {

        int count = 0;
        DefaultCategoryDataset barchartdata = new DefaultCategoryDataset();
        /*
        barchartdata.setValue(No of total volunteers for a given NGO, "Volunteers", "NGO1");
         */

        //  ArrayList<Integer> volunteers = new ArrayList<>();
        for (Network network : system.getNetworkList()) {

            int count1 = 10;
            if (network.getEnterpriseDirectory() != null && network.getEnterpriseDirectory().getEnterpriseList() != null && network.getEnterpriseDirectory().getEnterpriseList().size() > 0) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise.getProjectDirectory() != null && enterprise.getProjectDirectory().getProjectList() != null && enterprise.getProjectDirectory().getProjectList().size() > 0) {
                        for (Project project : enterprise.getProjectDirectory().getProjectList()) {
                            if (project.getVictimDirectory() != null && project.getVictimDirectory().getVictimList() != null && project.getVictimDirectory().getVictimList().size() > 0) {
                                count += project.getVictimDirectory().getVictimList().size();
                            }
                        }
                    }
                    barchartdata.setValue(count, "Number of peoples served", network.getName());
                    count += count1 + 10;
                }
            }
        }

        JFreeChart barchart = ChartFactory.createBarChart("Number of peoples served in each Network", "In year 2016", "Peoples Served", barchartdata, PlotOrientation.VERTICAL, false, true, false);
//        CategoryPlot barchrt = (CategoryPlot) barchart.getPlot();

        ChartPanel barchartPanel = new ChartPanel(barchart);
        noOfPeopleServedJPanel.removeAll();
        noOfPeopleServedJPanel.add(barchartPanel);
        noOfPeopleServedJPanel.validate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        noOfOrgsJPanel = new javax.swing.JPanel();
        noOfPeopleServedJPanel = new javax.swing.JPanel();

        noOfOrgsJPanel.setBackground(new java.awt.Color(255, 255, 255));
        noOfOrgsJPanel.setLayout(new java.awt.BorderLayout());

        noOfPeopleServedJPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(noOfOrgsJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(noOfPeopleServedJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noOfPeopleServedJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(noOfOrgsJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        noOfPeopleServedJPanel.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel noOfOrgsJPanel;
    private javax.swing.JPanel noOfPeopleServedJPanel;
    // End of variables declaration//GEN-END:variables

}