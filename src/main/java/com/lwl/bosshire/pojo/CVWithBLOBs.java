package com.lwl.bosshire.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class CVWithBLOBs extends CV {
    private String cvPersonalSkill;

    private String cvHopeCareer;

    private String cvWorkExp;

    private String cvProjectExp;

    private String cvStudyExp;

    @Builder
    private CVWithBLOBs(Integer cvId, Integer cvUid, String cvFullName, Integer cvSex, String cvPhone, String cvBirth, String cvEmail, String cvWxid, String cvHeadImage, Date cvCreateTime, Integer cvStatus, String cvPersonalSkill, String cvHopeCareer, String cvWorkExp, String cvProjectExp, String cvStudyExp) {
        super(cvId, cvUid, cvFullName, cvSex, cvPhone, cvBirth, cvEmail, cvWxid, cvHeadImage, cvCreateTime, cvStatus);
        this.cvPersonalSkill = cvPersonalSkill;
        this.cvHopeCareer = cvHopeCareer;
        this.cvWorkExp = cvWorkExp;
        this.cvProjectExp = cvProjectExp;
        this.cvStudyExp = cvStudyExp;
    }
}