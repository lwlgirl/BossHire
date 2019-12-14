package com.lwl.bosshire.dao;

import com.lwl.bosshire.pojo.CareerTagExample;
import com.lwl.bosshire.pojo.CareerTagKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CareerTagMapper {
    int countByExample(CareerTagExample example);

    int deleteByExample(CareerTagExample example);

    int deleteByPrimaryKey(CareerTagKey key);

    int insert(CareerTagKey record);

    int insertSelective(CareerTagKey record);

    List<CareerTagKey> selectByExample(CareerTagExample example);

    int updateByExampleSelective(@Param("record") CareerTagKey record, @Param("example") CareerTagExample example);

    int updateByExample(@Param("record") CareerTagKey record, @Param("example") CareerTagExample example);
}