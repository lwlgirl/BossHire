package com.lwl.bosshire.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class CVWithBLOBs extends CV {
    private String cvPersonalSkill;

    private String cvHopeCareer;

    private String cvWorkExp;

    private String cvProjectExp;

    private String cvStudyExp;

}