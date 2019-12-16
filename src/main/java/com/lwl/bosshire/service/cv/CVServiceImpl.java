package com.lwl.bosshire.service.cv;

import com.lwl.bosshire.common.Role;
import com.lwl.bosshire.common.ServiceResponse;
import com.lwl.bosshire.dao.CVMapper;
import com.lwl.bosshire.dao.JobApplyMapper;
import com.lwl.bosshire.pojo.*;
import com.lwl.bosshire.service.company.CompanyBasicService;
import com.lwl.bosshire.utils.UserContext;
import com.lwl.bosshire.vo.DeliverCV;
import lombok.extern.log4j.Log4j;

import java.util.*;

import static com.lwl.bosshire.config.DataSourceUtils.*;
import static com.lwl.bosshire.common.ServiceResponse.*;
import static com.lwl.bosshire.utils.CommonUtils.*;

/**
 * @author lzf abc123lzf@126.com
 * @since 2019/12/16 11:09
 */
@Log4j
public class CVServiceImpl implements CVService {

    private final CompanyBasicService companyBasicService = CompanyBasicService.INSTANCE;


    @Override
    public ServiceResponse<Void> insertPersonalCV(CVWithBLOBs cv) {
        if(UserContext.userRole() != Role.JH) {
            return failure(-1);
        }

        User user = UserContext.get();

        cv.setCvUid(UserContext.get().getUserId());
        cv.setCvCreateTime(new Date());
        CVMapper mapper = getMapper(CVMapper.class);

        try {
            int res;
            if(cv.getCvId() != null) {
                CVExample cve = new CVExample();
                cve.createCriteria().andCvIdEqualTo(cv.getCvId());
                CV ocv = getFirst(mapper.selectByExample(cve));
                if(!ocv.getCvUid().equals(user.getUserId())) {
                    return failure(2);
                }
                res = mapper.updateByExampleWithBLOBs(cv, cve);
            } else {
                res = mapper.insertSelective(cv);
            }

            commit();
            return res > 0 ? success() : failure(1);
        } catch (RuntimeException e) {
            log.error(e);
            rollback();
            return failure(-2);
        }
    }


    @Override
    public ServiceResponse<CVWithBLOBs> showPersonalCV(int cvid) {
        if(UserContext.userRole() != Role.JH) {
            return failure(-1);
        }

        User user = UserContext.get();
        int uid = user.getUserId();
        CVExample cve = new CVExample();
        cve.createCriteria().andCvIdEqualTo(uid).andCvUidEqualTo(uid);

        CVMapper mapper = getMapper(CVMapper.class);
        CVWithBLOBs cv = getFirst(mapper.selectByExampleWithBLOBs(cve));

        return cv != null ? success(cv) : failure(1);
    }


    @Override
    public ServiceResponse<List<DeliverCV>> companyCVList() {
        if(UserContext.userRole() != Role.HR) {
            return failure(-1);
        }

        ServiceResponse<Company> res = companyBasicService.company();
        if(!res.isSuccess()) {
            return failure(1);
        }

        int cid = res.data().getCompanyId();
        JobApplyMapper jam = getMapper(JobApplyMapper.class);
        JobApplyExample jae = new JobApplyExample();
        jae.createCriteria().andJaCompanyIdEqualTo(cid);
        List<JobApply> list = jam.selectByExample(jae);

        Map<Integer, JobApply> jbMap = new HashMap<>(list.size() * 2);
        List<Integer> cvIds = new ArrayList<>(list.size());
        list.forEach(e -> {
            cvIds.add(e.getJaCvId());
            jbMap.put(e.getJaCvId(), e);
        });

        CVMapper mapper = getMapper(CVMapper.class);
        CVExample cve = new CVExample();
        cve.createCriteria().andCvIdIn(cvIds);

        List<CV> cvs = mapper.selectByExample(cve);
        List<DeliverCV> result = new ArrayList<>(cvs.size());

        cvs.forEach(e -> {
            JobApply ja = jbMap.get(e.getCvId());
            if(ja != null) {
                DeliverCV dcv = new DeliverCV();
                dcv.setCv(e);
                dcv.setSubmitTime(ja.getJaSubmitTime());
                dcv.setStatus(ja.getJaStatus());
                result.add(dcv);
            }
        });

        return success(result);
    }

    @Override
    public ServiceResponse<List<CV>> personalCVList() {
        if(UserContext.userRole() != Role.JH) {
            return failure(-1);
        }

        User user = UserContext.get();
        int uid = user.getUserId();

        CVMapper mapper = getMapper(CVMapper.class);
        CVExample cve = new CVExample();
        cve.createCriteria().andCvUidEqualTo(uid);

        List<CV> cvs = mapper.selectByExample(cve);
        return success(cvs);
    }
}
