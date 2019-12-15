package com.lwl.bosshire.pojo;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
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
}