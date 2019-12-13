package com.lwl.bosshire.pojo;

import java.util.Date;

public class User {
    private Integer userId;

    private String userName;

    private String userAddress;

    private Date userGraduateTime;

    private String educationBackground;

    private String major;

    private Date enrollmentYear;

    private String associationActivity;

    private String expectedCareer;

    private String expectedCity;

    private String personalAdvantage;

    private String userPassword;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public Date getUserGraduateTime() {
        return userGraduateTime;
    }

    public void setUserGraduateTime(Date userGraduateTime) {
        this.userGraduateTime = userGraduateTime;
    }

    public String getEducationBackground() {
        return educationBackground;
    }

    public void setEducationBackground(String educationBackground) {
        this.educationBackground = educationBackground == null ? null : educationBackground.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public Date getEnrollmentYear() {
        return enrollmentYear;
    }

    public void setEnrollmentYear(Date enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public String getAssociationActivity() {
        return associationActivity;
    }

    public void setAssociationActivity(String associationActivity) {
        this.associationActivity = associationActivity == null ? null : associationActivity.trim();
    }

    public String getExpectedCareer() {
        return expectedCareer;
    }

    public void setExpectedCareer(String expectedCareer) {
        this.expectedCareer = expectedCareer == null ? null : expectedCareer.trim();
    }

    public String getExpectedCity() {
        return expectedCity;
    }

    public void setExpectedCity(String expectedCity) {
        this.expectedCity = expectedCity == null ? null : expectedCity.trim();
    }

    public String getPersonalAdvantage() {
        return personalAdvantage;
    }

    public void setPersonalAdvantage(String personalAdvantage) {
        this.personalAdvantage = personalAdvantage == null ? null : personalAdvantage.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }
}