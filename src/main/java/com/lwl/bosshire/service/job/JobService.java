package com.lwl.bosshire.service.job;

import com.lwl.bosshire.common.ServiceResponse;
import com.lwl.bosshire.pojo.JobApply;

import java.util.List;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.16 14:56
 */
public interface JobService {

    JobService INSTANCE = new JobServiceImpl();

    /**
     * 修改投递者求职状态
     * @return 服务响应
     */
    ServiceResponse<Void> changeStatus(List<Integer> cvids, int status);

    /**
     * @return 个人投递记录/公司收到的简历投递
     */
    ServiceResponse<List<JobApply>> queryJobApplyInfo();


    /**
     * 判断简历是否已经投递给了当前公司
     * @param cid 公司ID
     * @param cvid 简历ID
     * @return 判断结果
     */
    ServiceResponse<Boolean> checkoutCVInCompanyJobApplyList(int cid, int cvid);

    /**
     * 个人提交职位申请
     * @param careerId 职位ID
     * @param cvid 个人简历ID
     * @return 服务结果
     */
    ServiceResponse<Void> sendJobApply(int careerId, int cvid);

}
