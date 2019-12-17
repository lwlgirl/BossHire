package com.lwl.bosshire.service.job;

import com.lwl.bosshire.common.Role;
import com.lwl.bosshire.common.ServiceResponse;
import com.lwl.bosshire.dao.JobApplyMapper;
import com.lwl.bosshire.pojo.Company;
import com.lwl.bosshire.pojo.JobApply;
import com.lwl.bosshire.pojo.JobApplyExample;
import com.lwl.bosshire.pojo.User;
import com.lwl.bosshire.service.company.CompanyBasicService;
import com.lwl.bosshire.utils.UserContext;
import lombok.extern.log4j.Log4j;

import java.util.List;

import static com.lwl.bosshire.common.ServiceResponse.*;
import static com.lwl.bosshire.config.DataSourceUtils.*;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.16 14:56
 */
@Log4j
class JobServiceImpl implements JobService {

    private final CompanyBasicService companyBasicService = CompanyBasicService.INSTANCE;


    @Override
    public ServiceResponse<Void> changeStatus(List<Integer> cvids, int status) {
        if(UserContext.userRole() != Role.HR) {
            return failure(-1);
        }

        ServiceResponse<Company> resp = companyBasicService.company();
        if(!resp.isSuccess()) {
            return failure(1);
        }

        int cid = resp.data().getCompanyId();

        JobApplyMapper mapper = getMapper(JobApplyMapper.class);
        JobApplyExample jae = new JobApplyExample();
        jae.createCriteria().andJaCvIdIn(cvids).andJaCompanyIdEqualTo(cid);

        List<JobApply> list = mapper.selectByExample(jae);

        try {
            list.forEach(e -> {
                e.setJaStatus(status);
                mapper.updateByPrimaryKeySelective(e);
            });
            commit();
            return success();
        } catch (RuntimeException e) {
            log.error(e);
            rollback();
            return failure(-2);
        }
    }


    @Override
    public ServiceResponse<List<JobApply>> queryJobApplyInfo() {
        Role role = UserContext.userRole();
        if(role == Role.HR) {
            ServiceResponse<Company> resp = companyBasicService.company();
            if(!resp.isSuccess()) {
                return failure(1);
            }

            int cid = resp.data().getCompanyId();
            JobApplyMapper mapper = getMapper(JobApplyMapper.class);
            JobApplyExample jae = new JobApplyExample();
            jae.createCriteria().andJaCompanyIdEqualTo(cid);

            List<JobApply> list = mapper.selectByExample(jae);

            return success(list);
        } else if(role == Role.JH) {
            User user = UserContext.get();
            int uid = user.getUserId();

            JobApplyMapper mapper = getMapper(JobApplyMapper.class);
            JobApplyExample jae = new JobApplyExample();
            jae.createCriteria().andJaDelivererUidEqualTo(uid);
            List<JobApply> list = mapper.selectByExample(jae);

            return success(list);
        }

        return failure(-1);
    }


    @Override
    public ServiceResponse<Boolean> checkoutCVInCompanyJobApplyList(int cid, int cvid) {
        JobApplyMapper mapper = getMapper(JobApplyMapper.class);
        JobApplyExample jae = new JobApplyExample();
        jae.createCriteria().andJaCvIdEqualTo(cid).andJaCompanyIdEqualTo(cid);

        int sz = mapper.selectByExample(jae).size();
        return sz > 0 ? success(true) : success(false);
    }


    @Override
    public ServiceResponse<Void> sendJobApply(int careerId, int cvid) {
        JobApply ja = new JobApply();
        ja.setJaCvId(cvid);
        return null;
    }
}
