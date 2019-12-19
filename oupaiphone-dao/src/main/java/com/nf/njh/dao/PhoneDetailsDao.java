package com.nf.njh.dao;

import com.nf.njh.entity.PhoneDetails;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PhoneDetailsDao {
    List<PhoneDetails> getAllphone(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    void addphone(PhoneDetails details);
    void deletephone(Integer phoneid);
    void updatephone(PhoneDetails details);


}
