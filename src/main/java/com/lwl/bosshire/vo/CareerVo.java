package com.lwl.bosshire.vo;

import com.lwl.bosshire.pojo.Career;
import com.lwl.bosshire.pojo.Company;
import com.lwl.bosshire.pojo.Tag;
import lombok.Data;

import java.util.List;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.15 16:18
 */
@Data
public class CareerVo {

    private Integer id;

    private String name;

    private Integer type;

    private String typeName;

    private Integer salaryMin;

    private Integer salaryMax;

    private Integer companyId;

    private Company companyInfo;

    private String desc;

    private List<Tag> tags;

    public CareerVo(Career career) {
        this.id = career.getCareerId();
        this.name = career.getCareerName();
        this.type = career.getCareerType();
        this.salaryMin = career.getCareerSalaryMin();
        this.salaryMax = career.getCareerSalaryMax();
        this.companyId = career.getCareerCompanyId();
        this.desc = career.getCareerDesc();
    }
}
