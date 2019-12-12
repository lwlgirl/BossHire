package com.lwl.bosshire.pojo;

import lombok.Data;

@Data
public class UserDeliveryRecord {
    private int userDeliveryRecordId;
    private String userDeliveryRecordUser;
    private int  userDeliveryRecordCareerId;
    private String userDeliveryRecordDate;
    private String userDeliveryRecordStatus;
    private String userDeliveryRecordCompanyName;
    private String userDeliveryRecordCareerName;
    private int userDeliveryRecordCompanyId;
    private String userDeliveryRecordUserName;
}
