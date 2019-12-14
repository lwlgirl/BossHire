package com.lwl.bosshire.pojo;

public class Career {
    private Integer careerId;

    private String careerName;

    private Integer careerType;

    private Integer careerSalaryMin;

    private Integer careerSalaryMax;

    private Integer careerCompanyId;

    private String careerSalaryDesc;

    public Integer getCareerId() {
        return careerId;
    }

    public void setCareerId(Integer careerId) {
        this.careerId = careerId;
    }

    public String getCareerName() {
        return careerName;
    }

    public void setCareerName(String careerName) {
        this.careerName = careerName == null ? null : careerName.trim();
    }

    public Integer getCareerType() {
        return careerType;
    }

    public void setCareerType(Integer careerType) {
        this.careerType = careerType;
    }

    public Integer getCareerSalaryMin() {
        return careerSalaryMin;
    }

    public void setCareerSalaryMin(Integer careerSalaryMin) {
        this.careerSalaryMin = careerSalaryMin;
    }

    public Integer getCareerSalaryMax() {
        return careerSalaryMax;
    }

    public void setCareerSalaryMax(Integer careerSalaryMax) {
        this.careerSalaryMax = careerSalaryMax;
    }

    public Integer getCareerCompanyId() {
        return careerCompanyId;
    }

    public void setCareerCompanyId(Integer careerCompanyId) {
        this.careerCompanyId = careerCompanyId;
    }

    public String getCareerSalaryDesc() {
        return careerSalaryDesc;
    }

    public void setCareerSalaryDesc(String careerSalaryDesc) {
        this.careerSalaryDesc = careerSalaryDesc == null ? null : careerSalaryDesc.trim();
    }
}