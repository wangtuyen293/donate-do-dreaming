package model;

/**
 *
 * @author OS
 */
import java.io.Serializable;
import java.sql.Date;

public class Feedback implements Serializable {
    private int feedbackId;
    private int projectId;
    private int userId;
    private String content;
    private Date realTime;

    public Feedback(int feedbackId, int projectId, int userId, String content, Date realTime) {
        this.feedbackId = feedbackId;
        this.projectId = projectId;
        this.userId = userId;
        this.content = content;
        this.realTime = realTime;
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getRealTime() {
        return realTime;
    }

    public void setRealTime(Date realTime) {
        this.realTime = realTime;
    }

    
}
