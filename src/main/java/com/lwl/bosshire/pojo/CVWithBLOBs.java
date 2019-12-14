package com.lwl.bosshire.pojo;

public class CVWithBLOBs extends CV {
    private String cvPersonalSkill;

    private String cvHopeCareer;

    private String cvWorkExp;

    private String cvProjectExp;

    private String cvStudyExp;

    public String getCvPersonalSkill() {
        return cvPersonalSkill;
    }

    public void setCvPersonalSkill(String cvPersonalSkill) {
        this.cvPersonalSkill = cvPersonalSkill == null ? null : cvPersonalSkill.trim();
    }

    public String getCvHopeCareer() {
        return cvHopeCareer;
    }

    public void setCvHopeCareer(String cvHopeCareer) {
        this.cvHopeCareer = cvHopeCareer == null ? null : cvHopeCareer.trim();
    }

    public String getCvWorkExp() {
        return cvWorkExp;
    }

    public void setCvWorkExp(String cvWorkExp) {
        this.cvWorkExp = cvWorkExp == null ? null : cvWorkExp.trim();
    }

    public String getCvProjectExp() {
        return cvProjectExp;
    }

    public void setCvProjectExp(String cvProjectExp) {
        this.cvProjectExp = cvProjectExp == null ? null : cvProjectExp.trim();
    }

    public String getCvStudyExp() {
        return cvStudyExp;
    }

    public void setCvStudyExp(String cvStudyExp) {
        this.cvStudyExp = cvStudyExp == null ? null : cvStudyExp.trim();
    }
}