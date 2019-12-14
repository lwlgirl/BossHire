package com.lwl.bosshire.dao;

import com.lwl.bosshire.pojo.CareerType;
import com.lwl.bosshire.pojo.CareerTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CareerTypeMapper {
    int countByExample(CareerTypeExample example);

    int deleteByExample(CareerTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(CareerType record);

    int insertSelective(CareerType record);

    List<CareerType> selectByExample(CareerTypeExample example);

    CareerType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") CareerType record, @Param("example") CareerTypeExample example);

    int updateByExample(@Param("record") CareerType record, @Param("example") CareerTypeExample example);

    int updateByPrimaryKeySelective(CareerType record);

    int updateByPrimaryKey(CareerType record);
}