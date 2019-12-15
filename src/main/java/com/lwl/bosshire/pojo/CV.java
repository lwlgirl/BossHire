package com.lwl.bosshire.pojo;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
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


    public CV() { }
}