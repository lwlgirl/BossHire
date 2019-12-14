package com.lwl.bosshire.dao;

import com.lwl.bosshire.pojo.Career;
import com.lwl.bosshire.pojo.CareerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CareerMapper {
    int countByExample(CareerExample example);

    int deleteByExample(CareerExample example);

    int deleteByPrimaryKey(Integer careerId);

    int insert(Career record);

    int insertSelective(Career record);

    List<Career> selectByExampleWithBLOBs(CareerExample example);

    List<Career> selectByExample(CareerExample example);

    Career selectByPrimaryKey(Integer careerId);

    int updateByExampleSelective(@Param("record") Career record, @Param("example") CareerExample example);

    int updateByExampleWithBLOBs(@Param("record") Career record, @Param("example") CareerExample example);

    int updateByExample(@Param("record") Career record, @Param("example") CareerExample example);

    int updateByPrimaryKeySelective(Career record);

    int updateByPrimaryKeyWithBLOBs(Career record);

    int updateByPrimaryKey(Career record);
}