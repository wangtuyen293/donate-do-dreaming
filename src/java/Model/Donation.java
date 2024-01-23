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

public class Donation {
    private int donationId;
    private int projectId;
    private int userId;
    private int giftId;
    private int paymentMethodId;
    private double amountOfMoney;
    private Date donationTime;
    private int receiveGift;

    public Donation(int donationId, int projectId, int userId, int giftId, int paymentMethodId, double amountOfMoney, Date donationTime, int receiveGift) {
        this.donationId = donationId;
        this.projectId = projectId;
        this.userId = userId;
        this.giftId = giftId;
        this.paymentMethodId = paymentMethodId;
        this.amountOfMoney = amountOfMoney;
        this.donationTime = donationTime;
        this.receiveGift = receiveGift;
    }

    public int getDonationId() {
        return donationId;
    }

    public void setDonationId(int donationId) {
        this.donationId = donationId;
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

    public int getGiftId() {
        return giftId;
    }

    public void setGiftId(int giftId) {
        this.giftId = giftId;
    }

    public int getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(int paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public Date getDonationTime() {
        return donationTime;
    }

    public void setDonationTime(Date donationTime) {
        this.donationTime = donationTime;
    }

    public int getReceiveGift() {
        return receiveGift;
    }

    public void setReceiveGift(int receiveGift) {
        this.receiveGift = receiveGift;
    }

    
}

