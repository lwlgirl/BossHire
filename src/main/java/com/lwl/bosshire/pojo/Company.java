package com.lwl.bosshire.pojo;

import lombok.Builder;

import java.util.Date;

@Builder
public class Company {
    private Integer companyId;

    private String companyName;

    private String companyLogoImage;

    private Integer companyEmpNum;

    private String companySimpleDesc;

    private String companyDesc;

    private String companyAddress;

    private Date companyEstablishedTime;

    private Integer companyUid;

    public Company() {}

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyLogoImage() {
        return companyLogoImage;
    }

    public void setCompanyLogoImage(String companyLogoImage) {
        this.companyLogoImage = companyLogoImage == null ? null : companyLogoImage.trim();
    }

    public Integer getCompanyEmpNum() {
        return companyEmpNum;
    }

    public void setCompanyEmpNum(Integer companyEmpNum) {
        this.companyEmpNum = companyEmpNum;
    }

    public String getCompanySimpleDesc() {
        return companySimpleDesc;
    }

    public void setCompanySimpleDesc(String companySimpleDesc) {
        this.companySimpleDesc = companySimpleDesc == null ? null : companySimpleDesc.trim();
    }

    public String getCompanyDesc() {
        return companyDesc;
    }

    public void setCompanyDesc(String companyDesc) {
        this.companyDesc = companyDesc == null ? null : companyDesc.trim();
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public Date getCompanyEstablishedTime() {
        return companyEstablishedTime;
    }

    public void setCompanyEstablishedTime(Date companyEstablishedTime) {
        this.companyEstablishedTime = companyEstablishedTime;
    }

    public Integer getCompanyUid() {
        return companyUid;
    }

    public void setCompanyUid(Integer companyUid) {
        this.companyUid = companyUid;
    }
}