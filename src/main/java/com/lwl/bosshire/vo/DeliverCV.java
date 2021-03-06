package com.lwl.bosshire.vo;

import com.lwl.bosshire.pojo.CV;
import com.lwl.bosshire.pojo.JobApply;
import lombok.Data;

import java.util.Date;

/**
 * @author lzf abc123lzf@126.com
 * @since 2019/12/16 11:49
 * 投递的简历
 */
@Data
public class DeliverCV {

    private CV cv;

    private JobApply jobApplyInfo;
}
