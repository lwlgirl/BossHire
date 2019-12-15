package com.lwl.bosshire.pojo;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Career {
    private Integer careerId;

    private String careerName;

    private Integer careerType;

    private Integer careerSalaryMin;

    private Integer careerSalaryMax;

    private Integer careerCompanyId;

    private String careerDesc;

    public Career() { }
}