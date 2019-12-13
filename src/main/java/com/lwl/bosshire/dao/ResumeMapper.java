package com.lwl.bosshire.dao;

import com.lwl.bosshire.pojo.Resume;
import com.lwl.bosshire.pojo.ResumeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResumeMapper {
    int countByExample(ResumeExample example);

    int deleteByExample(ResumeExample example);

    int insert(Resume record);

    int insertSelective(Resume record);

    List<Resume> selectByExample(ResumeExample example);

    int updateByExampleSelective(@Param("record") Resume record, @Param("example") ResumeExample example);

    int updateByExample(@Param("record") Resume record, @Param("example") ResumeExample example);
}