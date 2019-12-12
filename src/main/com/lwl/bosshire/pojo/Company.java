package com.lwl.bosshire.pojo;

import lombok.Data;

@Data
public class Company {
    private Integer companyId;

    private String companyName;

    private String companyDescribe;

    private String companyAddress;

    private Integer companyLeader;

    private Integer companyCareer;
}
