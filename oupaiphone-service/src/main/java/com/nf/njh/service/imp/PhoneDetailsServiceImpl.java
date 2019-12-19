package com.nf.njh.service.imp;


import com.nf.njh.dao.PhoneDetailsDao;
import com.nf.njh.entity.PhoneDetails;
import com.nf.njh.service.PhoneDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneDetailsServiceImpl implements PhoneDetailsService {
    @Autowired
    private PhoneDetailsDao detailsDao;

    @Override
    public List<PhoneDetails> getAllPhone(int pageNum, int pageSize){
        return detailsDao.getAllphone(pageNum, pageSize);
    }

    @Override
    public void addphone(PhoneDetails phoneDetails){
         detailsDao.addphone(phoneDetails);
    }
    @Override
    public void updtephone(PhoneDetails phoneDetails){
        detailsDao.updatephone(phoneDetails);
    }
    @Override
    public void deletephone(Integer phoneByid){
        detailsDao.deletephone(phoneByid);
    }


}
