package com.lwl.bosshire.pojo;

public class Resume {
    private Integer resumeId;

    private String resumeContent;

    private Integer resumeUser;

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public String getResumeContent() {
        return resumeContent;
    }

    public void setResumeContent(String resumeContent) {
        this.resumeContent = resumeContent == null ? null : resumeContent.trim();
    }

    public Integer getResumeUser() {
        return resumeUser;
    }

    public void setResumeUser(Integer resumeUser) {
        this.resumeUser = resumeUser;
    }
}