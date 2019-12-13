package com.lwl.bosshire.pojo;

public class CompanyDeliveryRecord {
    private String companyDeliveryRecordId;

    private String companyDeliveryRecordUsername;

    private Integer companyDeliveryRecordUserid;

    private Integer companyDeliveryRecordCompanyid;

    public String getCompanyDeliveryRecordId() {
        return companyDeliveryRecordId;
    }

    public void setCompanyDeliveryRecordId(String companyDeliveryRecordId) {
        this.companyDeliveryRecordId = companyDeliveryRecordId == null ? null : companyDeliveryRecordId.trim();
    }

    public String getCompanyDeliveryRecordUsername() {
        return companyDeliveryRecordUsername;
    }

    public void setCompanyDeliveryRecordUsername(String companyDeliveryRecordUsername) {
        this.companyDeliveryRecordUsername = companyDeliveryRecordUsername == null ? null : companyDeliveryRecordUsername.trim();
    }

    public Integer getCompanyDeliveryRecordUserid() {
        return companyDeliveryRecordUserid;
    }

    public void setCompanyDeliveryRecordUserid(Integer companyDeliveryRecordUserid) {
        this.companyDeliveryRecordUserid = companyDeliveryRecordUserid;
    }

    public Integer getCompanyDeliveryRecordCompanyid() {
        return companyDeliveryRecordCompanyid;
    }

    public void setCompanyDeliveryRecordCompanyid(Integer companyDeliveryRecordCompanyid) {
        this.companyDeliveryRecordCompanyid = companyDeliveryRecordCompanyid;
    }
}