package com.lwl.bosshire.pojo;

public class Career {
    private Integer careerId;

    private String careerName;

    private String careerDescribe;

    private String careerRequirement;

    private Integer careerSalaryMin;

    private Integer careerSalaryMax;

    private Integer careerCompany;

    private String careerAdvantage;

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

    public String getCareerDescribe() {
        return careerDescribe;
    }

    public void setCareerDescribe(String careerDescribe) {
        this.careerDescribe = careerDescribe == null ? null : careerDescribe.trim();
    }

    public String getCareerRequirement() {
        return careerRequirement;
    }

    public void setCareerRequirement(String careerRequirement) {
        this.careerRequirement = careerRequirement == null ? null : careerRequirement.trim();
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

    public Integer getCareerCompany() {
        return careerCompany;
    }

    public void setCareerCompany(Integer careerCompany) {
        this.careerCompany = careerCompany;
    }

    public String getCareerAdvantage() {
        return careerAdvantage;
    }

    public void setCareerAdvantage(String careerAdvantage) {
        this.careerAdvantage = careerAdvantage == null ? null : careerAdvantage.trim();
    }
}