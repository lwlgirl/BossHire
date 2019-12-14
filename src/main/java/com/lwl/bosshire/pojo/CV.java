package com.lwl.bosshire.pojo;

import java.util.Date;

public class CV {
    private Integer cvId;

    private Integer cvUid;

    private String cvFullName;

    private Integer cvSex;

    private String cvPhone;

    private String cvBirth;

    private String cvEmail;

    private Integer cvWxid;

    private Date cvCreateTime;

    private Integer cvStatus;

    public Integer getCvId() {
        return cvId;
    }

    public void setCvId(Integer cvId) {
        this.cvId = cvId;
    }

    public Integer getCvUid() {
        return cvUid;
    }

    public void setCvUid(Integer cvUid) {
        this.cvUid = cvUid;
    }

    public String getCvFullName() {
        return cvFullName;
    }

    public void setCvFullName(String cvFullName) {
        this.cvFullName = cvFullName == null ? null : cvFullName.trim();
    }

    public Integer getCvSex() {
        return cvSex;
    }

    public void setCvSex(Integer cvSex) {
        this.cvSex = cvSex;
    }

    public String getCvPhone() {
        return cvPhone;
    }

    public void setCvPhone(String cvPhone) {
        this.cvPhone = cvPhone == null ? null : cvPhone.trim();
    }

    public String getCvBirth() {
        return cvBirth;
    }

    public void setCvBirth(String cvBirth) {
        this.cvBirth = cvBirth == null ? null : cvBirth.trim();
    }

    public String getCvEmail() {
        return cvEmail;
    }

    public void setCvEmail(String cvEmail) {
        this.cvEmail = cvEmail == null ? null : cvEmail.trim();
    }

    public Integer getCvWxid() {
        return cvWxid;
    }

    public void setCvWxid(Integer cvWxid) {
        this.cvWxid = cvWxid;
    }

    public Date getCvCreateTime() {
        return cvCreateTime;
    }

    public void setCvCreateTime(Date cvCreateTime) {
        this.cvCreateTime = cvCreateTime;
    }

    public Integer getCvStatus() {
        return cvStatus;
    }

    public void setCvStatus(Integer cvStatus) {
        this.cvStatus = cvStatus;
    }
}