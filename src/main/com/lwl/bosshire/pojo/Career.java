package com.lwl.bosshire.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Career {
    private Integer careerId;

    private String careerName;

    private String careerDescribe;

    private String careerRequirement;

    private Float careerSalary;

    private Integer careerCompany;

    private Integer careerAdvantage;

}
