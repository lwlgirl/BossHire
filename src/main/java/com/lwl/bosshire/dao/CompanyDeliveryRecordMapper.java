package com.lwl.bosshire.dao;

import com.lwl.bosshire.pojo.CompanyDeliveryRecord;
import com.lwl.bosshire.pojo.CompanyDeliveryRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyDeliveryRecordMapper {
    int countByExample(CompanyDeliveryRecordExample example);

    int deleteByExample(CompanyDeliveryRecordExample example);

    int insert(CompanyDeliveryRecord record);

    int insertSelective(CompanyDeliveryRecord record);

    List<CompanyDeliveryRecord> selectByExample(CompanyDeliveryRecordExample example);

    int updateByExampleSelective(@Param("record") CompanyDeliveryRecord record, @Param("example") CompanyDeliveryRecordExample example);

    int updateByExample(@Param("record") CompanyDeliveryRecord record, @Param("example") CompanyDeliveryRecordExample example);
}