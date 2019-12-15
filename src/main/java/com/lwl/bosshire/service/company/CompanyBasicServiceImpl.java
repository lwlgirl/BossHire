package com.lwl.bosshire.service.company;

import com.lwl.bosshire.common.Role;
import com.lwl.bosshire.common.ServiceResponse;
import com.lwl.bosshire.dao.CareerMapper;
import com.lwl.bosshire.dao.CareerTagMapper;
import com.lwl.bosshire.dao.CompanyMapper;
import com.lwl.bosshire.dao.TagMapper;
import com.lwl.bosshire.pojo.*;
import com.lwl.bosshire.utils.UserContext;
import com.lwl.bosshire.vo.CareerListVo;
import com.lwl.bosshire.vo.CareerVo;
import lombok.extern.log4j.Log4j;

import java.util.ArrayList;
import java.util.List;

import static com.lwl.bosshire.common.ServiceResponse.*;
import static com.lwl.bosshire.config.DataSourceUtils.*;
import static com.lwl.bosshire.utils.CommonUtils.*;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.15 16:03
 */
@Log4j
class CompanyBasicServiceImpl implements CompanyBasicService {

    @Override
    public ServiceResponse<Company> company() {
        User user = UserContext.get();
        if(user == null || user.getRole() != Role.HR.val()) {
            return failure(1);
        }

        CompanyMapper mapper = getMapper(CompanyMapper.class);
        CompanyExample ce = new CompanyExample();
        ce.createCriteria().andCompanyUidEqualTo(user.getUserId());
        Company c = getFirst(mapper.selectByExample(ce));

        return c != null ? success(c) : failure(2);
    }

    @Override
    public ServiceResponse<Company> company(int id) {
        CompanyMapper mapper = getMapper(CompanyMapper.class);
        CompanyExample ce = new CompanyExample();
        ce.createCriteria().andCompanyIdEqualTo(id);
        Company c = getFirst(mapper.selectByExample(ce));

        return c != null ? success(c) : failure(2);
    }


    @Override
    public ServiceResponse<Void> updateCompanyInfo(Company company) {
        User user = UserContext.get();
        if(user == null || user.getRole() != Role.HR.val()) {
            return failure(1);
        }

        try {
            CompanyMapper cm = getMapper(CompanyMapper.class);
            CompanyExample ce = new CompanyExample();
            ce.createCriteria().andCompanyUidEqualTo(user.getUserId());
            int cnt = cm.countByExample(ce);
            if (cnt == 0) {
                cm.updateByExampleSelective(company, ce);
            } else {
                company.setCompanyUid(user.getUserId());
                cm.insertSelective(company);
            }

            commit();
            return success();
        } catch (RuntimeException e) {
            rollback();
            log.warn(e);
            return failure(1);
        }
    }


    @Override
    public ServiceResponse<Void> addCareer(Career career) {
        if(UserContext.userRole() != Role.HR) {
            return failure(1);
        }

        ServiceResponse<Company> resp = company();
        if(!resp.isSuccess()) {
            return failure(2);
        }

        Company c = resp.data();
        CareerMapper cm = getMapper(CareerMapper.class);
        career.setCareerCompanyId(c.getCompanyId());
        int res = cm.insertSelective(career);

        return res > 0 ? success() : failure(3);
    }


    @Override
    public ServiceResponse<Void> updateCareer(Career career) {
        if(UserContext.userRole() != Role.HR) {
            return failure(1);
        }

        if(career.getCareerId() == null) {
            return failure(-1);
        }

        ServiceResponse<Company> resp = company();
        if(!resp.isSuccess()) {
            return failure(2);
        }

        Company c = resp.data();

        try {
            CareerMapper cm = getMapper(CareerMapper.class);
            CareerExample ce = new CareerExample();
            ce.createCriteria().andCareerIdEqualTo(career.getCareerId()).andCareerCompanyIdEqualTo(c.getCompanyId());
            int res = cm.updateByExampleSelective(career, ce);
            commit();
            return res > 0 ? success() : failure(3);
        } catch (RuntimeException e) {
            log.warn(e);
            rollback();
            return failure(-1);
        }
    }


    @Override
    public ServiceResponse<CareerListVo> companyCareerList() {
        if(UserContext.userRole() != Role.HR) {
            return failure(1);
        }

        ServiceResponse<Company> resp = company();
        if(!resp.isSuccess()) {
            return failure(2);
        }

        Company c = resp.data();

        CareerMapper mapper = getMapper(CareerMapper.class);
        CareerExample ce = new CareerExample();
        ce.createCriteria().andCareerCompanyIdEqualTo(c.getCompanyId());

        List<Career> list = mapper.selectByExample(ce);
        List<CareerVo> vos = new ArrayList<>(list.size());
        list.forEach(e -> vos.add(new CareerVo(e)));

        CareerListVo vo = CareerListVo.builder().careers(vos).build();
        return success(vo);
    }


    @Override
    public ServiceResponse<Void> deleteCareer(int id) {
        CareerMapper mapper = getMapper(CareerMapper.class);
        CareerExample ce = new CareerExample();
        ce.createCriteria().andCareerIdEqualTo(id);

        try {
            int res = mapper.deleteByPrimaryKey(id);
            commit();
            return res > 0 ? success() : failure(1);
        } catch (RuntimeException e) {
            log.error(e);
            rollback();
            return failure(-1);
        }
    }

    @Override
    public ServiceResponse<CareerVo> careerDetail(int id) {
        CareerMapper mapper = getMapper(CareerMapper.class);
        CareerExample ce = new CareerExample();
        ce.createCriteria().andCareerIdEqualTo(id);
        Career c = getFirst(mapper.selectByExampleWithBLOBs(ce));
        if(c == null) {
            return failure(1);
        }

        CareerVo vo = new CareerVo(c);
        ServiceResponse<Company> res = company(c.getCareerCompanyId());
        if(!res.isSuccess()) {
            return failure(2);
        }

        vo.setCompanyInfo(res.data());
        vo.setTags(tagList(c.getCareerId()));
        return success(vo);
    }


    private List<Tag> tagList(int careerId) {
        CareerTagMapper careerTagMapper = getMapper(CareerTagMapper.class);
        CareerTagExample cte = new CareerTagExample();
        cte.createCriteria().andCareerIdEqualTo(careerId);
        List<CareerTagKey> list = careerTagMapper.selectByExample(cte);
        List<Integer> l = new ArrayList<>(list.size());

        list.forEach(e -> l.add(e.getTagId()));

        TagExample te = new TagExample();
        te.createCriteria().andTagIdIn(l);
        TagMapper mapper = getMapper(TagMapper.class);

        return mapper.selectByExample(te);
    }
}

