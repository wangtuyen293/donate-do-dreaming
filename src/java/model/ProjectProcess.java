/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author quang
 */
import java.sql.Date;

public class ProjectProcess {
    private int processId;
    private Date updateDate;
    private String planOfPhase;
    private double moneyCost;
    private String image;
    private String description;
    private int userId;
    private int charityOrganizationId;
    private int projectId;
    private Project project;

    public ProjectProcess(int processId, Date updateDate, String planOfPhase, double moneyCost, String image, String description, int userId, int charityOrganizationId, int projectId) {
        this.processId = processId;
        this.updateDate = updateDate;
        this.planOfPhase = planOfPhase;
        this.moneyCost = moneyCost;
        this.image = image;
        this.description = description;
        this.userId = userId;
        this.charityOrganizationId = charityOrganizationId;
        this.projectId = projectId;
    }

    public ProjectProcess( Date updateDate, String planOfPhase, double moneyCost, String image, String description, Project project) {

        this.updateDate = updateDate;
        this.planOfPhase = planOfPhase;
        this.moneyCost = moneyCost;
        this.image = image;
        this.description = description;
        this.project = project;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public int getProcessId() {
        return processId;
    }

    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getPlanOfPhase() {
        return planOfPhase;
    }

    public void setPlanOfPhase(String planOfPhase) {
        this.planOfPhase = planOfPhase;
    }

    public double getMoneyCost() {
        return moneyCost;
    }

    public void setMoneyCost(double moneyCost) {
        this.moneyCost = moneyCost;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCharityOrganizationId() {
        return charityOrganizationId;
    }

    public void setCharityOrganizationId(int charityOrganizationId) {
        this.charityOrganizationId = charityOrganizationId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    
}

