package com.lwl.bosshire.dao;

import com.lwl.bosshire.pojo.Career;
import com.lwl.bosshire.pojo.CareerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CareerMapper {
    int countByExample(CareerExample example);

    int deleteByExample(CareerExample example);

    int insert(Career record);

    int insertSelective(Career record);

    List<Career> selectByExample(CareerExample example);

    int updateByExampleSelective(@Param("record") Career record, @Param("example") CareerExample example);

    int updateByExample(@Param("record") Career record, @Param("example") CareerExample example);
}