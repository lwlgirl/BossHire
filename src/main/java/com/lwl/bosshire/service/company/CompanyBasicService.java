package com.lwl.bosshire.service.company;

import com.lwl.bosshire.common.ServiceResponse;
import com.lwl.bosshire.pojo.Career;
import com.lwl.bosshire.pojo.Company;
import com.lwl.bosshire.vo.CareerListVo;
import com.lwl.bosshire.vo.CareerVo;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.15 16:02
 */
public interface CompanyBasicService {

    CompanyBasicService INSTANCE = new CompanyBasicServiceImpl();

    ServiceResponse<Company> company();

    ServiceResponse<Company> company(int id);

    ServiceResponse<Void> updateCompanyInfo(Company company);

    ServiceResponse<Void> addCareer(Career career);

    ServiceResponse<CareerListVo> companyCareerList();
    
    ServiceResponse<Void> updateCareer(Career career);

    ServiceResponse<Void> deleteCareer(int id);

    ServiceResponse<CareerVo> careerDetail(int id);

    ServiceResponse<Career> career(int id);
}
