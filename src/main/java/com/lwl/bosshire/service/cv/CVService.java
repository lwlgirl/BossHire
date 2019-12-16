package com.lwl.bosshire.service.cv;

import com.lwl.bosshire.common.ServiceResponse;
import com.lwl.bosshire.pojo.CV;
import com.lwl.bosshire.pojo.CVWithBLOBs;
import com.lwl.bosshire.vo.DeliverCV;

import java.util.List;

/**
 * @author lzf abc123lzf@126.com
 * @since 2019/12/16 11:07
 */
public interface CVService {

    CVService INSTANCE = new CVServiceImpl();

    /**
     * 个人写入简历
     * @param cv 简历信息
     * @return 响应消息
     */
    ServiceResponse<Void> insertPersonalCV(CVWithBLOBs cv);

    /**
     * 展示简历
     * @param cvid 简历ID
     * @return 简历消息
     */
    ServiceResponse<CVWithBLOBs> showCVDetail(int cvid);

    /**
     * 查看公司收到的简历
     * @return 简历
     */
    ServiceResponse<List<DeliverCV>> companyCVList();

    /**
     * 查看个人编写的简历列表
     * @return 简历
     */
    ServiceResponse<List<CV>> personalCVList();
}
