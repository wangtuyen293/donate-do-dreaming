/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author quang
 */
public class ProjectMilestoneGift {

    private int projectMilestoneGiftId;
    private String projectMilestoneGiftName;
    private int projectId;
    private int userId;
    private String description;

    public ProjectMilestoneGift(int projectMilestoneGiftId, String projectMilestoneGiftName, int projectId, int userId, String description) {
        this.projectMilestoneGiftId = projectMilestoneGiftId;
        this.projectMilestoneGiftName = projectMilestoneGiftName;
        this.projectId = projectId;
        this.userId = userId;
        this.description = description;
    }

    public int getProjectMilestoneGiftId() {
        return projectMilestoneGiftId;
    }

    public void setProjectMilestoneGiftId(int projectMilestoneGiftId) {
        this.projectMilestoneGiftId = projectMilestoneGiftId;
    }

    public String getProjectMilestoneGiftName() {
        return projectMilestoneGiftName;
    }

    public void setProjectMilestoneGiftName(String projectMilestoneGiftName) {
        this.projectMilestoneGiftName = projectMilestoneGiftName;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
