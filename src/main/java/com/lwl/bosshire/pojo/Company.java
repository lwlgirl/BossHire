package com.lwl.bosshire.pojo;

public class Company {
    private Integer companyId;

    private String companyName;

    private String companyDescribe;

    private String companyAddress;

    private String companyLeader;

    private String companyCareer;

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

    public String getCompanyDescribe() {
        return companyDescribe;
    }

    public void setCompanyDescribe(String companyDescribe) {
        this.companyDescribe = companyDescribe == null ? null : companyDescribe.trim();
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public String getCompanyLeader() {
        return companyLeader;
    }

    public void setCompanyLeader(String companyLeader) {
        this.companyLeader = companyLeader == null ? null : companyLeader.trim();
    }

    public String getCompanyCareer() {
        return companyCareer;
    }

    public void setCompanyCareer(String companyCareer) {
        this.companyCareer = companyCareer == null ? null : companyCareer.trim();
    }
}