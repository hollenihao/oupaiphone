package com.nf.njh.service;

import com.nf.njh.dao.UserInfoDao;
import com.nf.njh.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserInfoService {

    UserInfo queryUser(String uName, String uPassword);
    //查询所有用户分页
    List<UserInfo> getAllUser(int pageNum,int pageSize);
    //查询账号
    String selectUserName(String uName);
}
