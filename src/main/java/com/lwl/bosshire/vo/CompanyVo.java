package com.lwl.bosshire.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.15 16:20
 */
@Data
public class CompanyVo {

    private Integer companyId;

    private String companyName;

    private String companyLogoImage;

    private Integer companyEmpNum;

    private String companySimpleDesc;

    private String companyDesc;

    private String companyAddress;

    private Date companyEstablishedTime;

    private Integer companyUid;
}
