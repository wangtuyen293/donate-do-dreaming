/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author quang
 */
public class CharityOrganization {

    private int charityOrganizationId;
    private String charityOrganizationName;
    private String charityOrganizationEmail;
    private String charityOrganizationLogo;
    private String charityOrganizationAddress;
    private String charityOrganizationPhone;

    public CharityOrganization(int charityOrganizationId, String charityOrganizationName, String charityOrganizationEmail, String charityOrganizationLogo, String charityOrganizationAddress, String charityOrganizationPhone) {
        this.charityOrganizationId = charityOrganizationId;
        this.charityOrganizationName = charityOrganizationName;
        this.charityOrganizationEmail = charityOrganizationEmail;
        this.charityOrganizationLogo = charityOrganizationLogo;
        this.charityOrganizationAddress = charityOrganizationAddress;
        this.charityOrganizationPhone = charityOrganizationPhone;
    }

    public int getCharityOrganizationId() {
        return charityOrganizationId;
    }

    public void setCharityOrganizationId(int charityOrganizationId) {
        this.charityOrganizationId = charityOrganizationId;
    }

    public String getCharityOrganizationName() {
        return charityOrganizationName;
    }

    public void setCharityOrganizationName(String charityOrganizationName) {
        this.charityOrganizationName = charityOrganizationName;
    }

    public String getCharityOrganizationEmail() {
        return charityOrganizationEmail;
    }

    public void setCharityOrganizationEmail(String charityOrganizationEmail) {
        this.charityOrganizationEmail = charityOrganizationEmail;
    }

    public String getCharityOrganizationLogo() {
        return charityOrganizationLogo;
    }

    public void setCharityOrganizationLogo(String charityOrganizationLogo) {
        this.charityOrganizationLogo = charityOrganizationLogo;
    }

    public String getCharityOrganizationAddress() {
        return charityOrganizationAddress;
    }

    public void setCharityOrganizationAddress(String charityOrganizationAddress) {
        this.charityOrganizationAddress = charityOrganizationAddress;
    }

    public String getCharityOrganizationPhone() {
        return charityOrganizationPhone;
    }

    public void setCharityOrganizationPhone(String charityOrganizationPhone) {
        this.charityOrganizationPhone = charityOrganizationPhone;
    }

}
