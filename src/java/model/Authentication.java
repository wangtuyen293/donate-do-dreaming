/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author quang
 */
public class Authentication {

    private int authenId;
    private int userId;
    private int googleUserId;
    private int facebookUserId;

    public Authentication(int authenId, int userId, int googleUserId, int facebookUserId) {
        this.authenId = authenId;
        this.userId = userId;
        this.googleUserId = googleUserId;
        this.facebookUserId = facebookUserId;
    }

    public int getAuthenId() {
        return authenId;
    }

    public void setAuthenId(int authenId) {
        this.authenId = authenId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getGoogleUserId() {
        return googleUserId;
    }

    public void setGoogleUserId(int googleUserId) {
        this.googleUserId = googleUserId;
    }

    public int getFacebookUserId() {
        return facebookUserId;
    }

    public void setFacebookUserId(int facebookUserId) {
        this.facebookUserId = facebookUserId;
    }

}
