package com.lwl.bosshire.dao;

import com.lwl.bosshire.pojo.UserDeliveryRecord;
import com.lwl.bosshire.pojo.UserDeliveryRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDeliveryRecordMapper {
    int countByExample(UserDeliveryRecordExample example);

    int deleteByExample(UserDeliveryRecordExample example);

    int insert(UserDeliveryRecord record);

    int insertSelective(UserDeliveryRecord record);

    List<UserDeliveryRecord> selectByExample(UserDeliveryRecordExample example);

    int updateByExampleSelective(@Param("record") UserDeliveryRecord record, @Param("example") UserDeliveryRecordExample example);

    int updateByExample(@Param("record") UserDeliveryRecord record, @Param("example") UserDeliveryRecordExample example);
}