package com.user.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dao.ContactInfoDao;
import com.user.vo.ContactInfo;

@Service
public class ContactBo {
	@Autowired
	private ContactInfoDao dao;
	
	public void contactInfoAdd(ContactInfo info) {
		try {
			dao.contactInfo(info);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
