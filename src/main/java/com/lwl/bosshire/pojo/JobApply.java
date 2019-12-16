package com.lwl.bosshire.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class JobApply {
    private Integer jaId;

    private Integer jaCompanyId;

    private Integer jaCvId;

    private Integer jaDelivererUid;

    private Date jaSubmitTime;

    private Integer jaStatus;
}