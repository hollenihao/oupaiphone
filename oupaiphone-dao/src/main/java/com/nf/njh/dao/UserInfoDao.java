package com.nf.njh.dao;


import com.nf.njh.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfoDao {
    //登入验证
     UserInfo queryUser(@Param("uName")String uName,@Param("uPassword")String uPassword);
    //查询所有用户分页
     List<UserInfo> getAllUser(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize);
    //查询账号
    String selectUserName(@Param("uName")String uName);
}
