package com.lwl.bosshire.dao;

import com.lwl.bosshire.pojo.JobApply;
import com.lwl.bosshire.pojo.JobApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobApplyMapper {
    int countByExample(JobApplyExample example);

    int deleteByExample(JobApplyExample example);

    int deleteByPrimaryKey(Integer jaId);

    int insert(JobApply record);

    int insertSelective(JobApply record);

    List<JobApply> selectByExample(JobApplyExample example);

    JobApply selectByPrimaryKey(Integer jaId);

    int updateByExampleSelective(@Param("record") JobApply record, @Param("example") JobApplyExample example);

    int updateByExample(@Param("record") JobApply record, @Param("example") JobApplyExample example);

    int updateByPrimaryKeySelective(JobApply record);

    int updateByPrimaryKey(JobApply record);
}