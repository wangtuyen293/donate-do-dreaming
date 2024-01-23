/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author quang
 */
import java.sql.Date;

public class Project {
    private int projectId;
    private String projectName;
    private double projectTarget;
    private String projectImage;
    private double donatedAmountOfMoney;
    private String projectStatus;
    private String projectDescription;
    private Date startDate;
    private Date endDate;
    private int userId;
    private int charityOrganizationId;
    private int categoryId;

    public Project(int projectId, String projectName, double projectTarget, String projectImage, double donatedAmountOfMoney, String projectStatus, String projectDescription, Date startDate, Date endDate, int userId, int charityOrganizationId, int categoryId) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectTarget = projectTarget;
        this.projectImage = projectImage;
        this.donatedAmountOfMoney = donatedAmountOfMoney;
        this.projectStatus = projectStatus;
        this.projectDescription = projectDescription;
        this.startDate = startDate;
        this.endDate = endDate;
        this.userId = userId;
        this.charityOrganizationId = charityOrganizationId;
        this.categoryId = categoryId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public double getProjectTarget() {
        return projectTarget;
    }

    public void setProjectTarget(double projectTarget) {
        this.projectTarget = projectTarget;
    }

    public String getProjectImage() {
        return projectImage;
    }

    public void setProjectImage(String projectImage) {
        this.projectImage = projectImage;
    }

    public double getDonatedAmountOfMoney() {
        return donatedAmountOfMoney;
    }

    public void setDonatedAmountOfMoney(double donatedAmountOfMoney) {
        this.donatedAmountOfMoney = donatedAmountOfMoney;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    
}

