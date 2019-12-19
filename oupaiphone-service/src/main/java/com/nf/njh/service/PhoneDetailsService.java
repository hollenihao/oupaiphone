package com.nf.njh.service;


import com.nf.njh.entity.PhoneDetails;

import java.util.List;

public interface PhoneDetailsService {
   List<PhoneDetails> getAllPhone(int pageNum,int pageSize);

   void addphone(PhoneDetails details);

   void updtephone(PhoneDetails details);

   void deletephone(Integer phoneByid);
}
