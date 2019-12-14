package com.lwl.bosshire.dao;

import com.lwl.bosshire.pojo.CV;
import com.lwl.bosshire.pojo.CVExample;
import com.lwl.bosshire.pojo.CVWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CVMapper {
    int countByExample(CVExample example);

    int deleteByExample(CVExample example);

    int deleteByPrimaryKey(Integer cvId);

    int insert(CVWithBLOBs record);

    int insertSelective(CVWithBLOBs record);

    List<CVWithBLOBs> selectByExampleWithBLOBs(CVExample example);

    List<CV> selectByExample(CVExample example);

    CVWithBLOBs selectByPrimaryKey(Integer cvId);

    int updateByExampleSelective(@Param("record") CVWithBLOBs record, @Param("example") CVExample example);

    int updateByExampleWithBLOBs(@Param("record") CVWithBLOBs record, @Param("example") CVExample example);

    int updateByExample(@Param("record") CV record, @Param("example") CVExample example);

    int updateByPrimaryKeySelective(CVWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CVWithBLOBs record);

    int updateByPrimaryKey(CV record);
}