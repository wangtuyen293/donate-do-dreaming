/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author quang
 */
public class UserGoogle {

    private int googleUserId;
    private String userName;
    private String email;
    private String accessToken;

    public UserGoogle(int googleUserId, String userName, String email, String accessToken) {
        this.googleUserId = googleUserId;
        this.userName = userName;
        this.email = email;
        this.accessToken = accessToken;
    }

    public int getGoogleUserId() {
        return googleUserId;
    }

    public void setGoogleUserId(int googleUserId) {
        this.googleUserId = googleUserId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

}
