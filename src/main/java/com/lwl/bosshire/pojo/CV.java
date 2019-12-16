package com.lwl.bosshire.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CV {
    private Integer cvId;

    private Integer cvUid;

    private String cvFullName;

    private Integer cvSex;

    private String cvPhone;

    private String cvBirth;

    private String cvEmail;

    private String cvWxid;

    private String cvHeadImage;

    private Date cvCreateTime;

    private Integer cvStatus;

}