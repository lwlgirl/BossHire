package com.lwl.bosshire.pojo;

import java.util.Date;

public class UserDeliveryRecord {
    private String userDeliveryRecordId;

    private Integer userDeliveryRecordUser;

    private Integer userDeliveryRecordCareerid;

    private Date userDeliveryRecordDate;

    private String userDeliveryRecordStatus;

    private String userDeliveryRecordCompanyname;

    private String userDeliveryRecordCareername;

    private Integer userDeliveryRecordCompanyid;

    private String userDeliveryRecordUsername;

    public String getUserDeliveryRecordId() {
        return userDeliveryRecordId;
    }

    public void setUserDeliveryRecordId(String userDeliveryRecordId) {
        this.userDeliveryRecordId = userDeliveryRecordId == null ? null : userDeliveryRecordId.trim();
    }

    public Integer getUserDeliveryRecordUser() {
        return userDeliveryRecordUser;
    }

    public void setUserDeliveryRecordUser(Integer userDeliveryRecordUser) {
        this.userDeliveryRecordUser = userDeliveryRecordUser;
    }

    public Integer getUserDeliveryRecordCareerid() {
        return userDeliveryRecordCareerid;
    }

    public void setUserDeliveryRecordCareerid(Integer userDeliveryRecordCareerid) {
        this.userDeliveryRecordCareerid = userDeliveryRecordCareerid;
    }

    public Date getUserDeliveryRecordDate() {
        return userDeliveryRecordDate;
    }

    public void setUserDeliveryRecordDate(Date userDeliveryRecordDate) {
        this.userDeliveryRecordDate = userDeliveryRecordDate;
    }

    public String getUserDeliveryRecordStatus() {
        return userDeliveryRecordStatus;
    }

    public void setUserDeliveryRecordStatus(String userDeliveryRecordStatus) {
        this.userDeliveryRecordStatus = userDeliveryRecordStatus == null ? null : userDeliveryRecordStatus.trim();
    }

    public String getUserDeliveryRecordCompanyname() {
        return userDeliveryRecordCompanyname;
    }

    public void setUserDeliveryRecordCompanyname(String userDeliveryRecordCompanyname) {
        this.userDeliveryRecordCompanyname = userDeliveryRecordCompanyname == null ? null : userDeliveryRecordCompanyname.trim();
    }

    public String getUserDeliveryRecordCareername() {
        return userDeliveryRecordCareername;
    }

    public void setUserDeliveryRecordCareername(String userDeliveryRecordCareername) {
        this.userDeliveryRecordCareername = userDeliveryRecordCareername == null ? null : userDeliveryRecordCareername.trim();
    }

    public Integer getUserDeliveryRecordCompanyid() {
        return userDeliveryRecordCompanyid;
    }

    public void setUserDeliveryRecordCompanyid(Integer userDeliveryRecordCompanyid) {
        this.userDeliveryRecordCompanyid = userDeliveryRecordCompanyid;
    }

    public String getUserDeliveryRecordUsername() {
        return userDeliveryRecordUsername;
    }

    public void setUserDeliveryRecordUsername(String userDeliveryRecordUsername) {
        this.userDeliveryRecordUsername = userDeliveryRecordUsername == null ? null : userDeliveryRecordUsername.trim();
    }
}