package com.nf.njh.service.imp;

import com.nf.njh.dao.UserInfoDao;
import com.nf.njh.entity.UserInfo;
import com.nf.njh.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImp implements UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo queryUser(String uName, String uPassword) {
        return userInfoDao.queryUser(uName, uPassword);
    }

    @Override
    public List<UserInfo> getAllUser(int pageNum, int pageSize) {
        return userInfoDao.getAllUser(pageNum, pageSize);
    }

    @Override
    public String selectUserName(String uName) {
        return userInfoDao.selectUserName(uName);
    }
}
