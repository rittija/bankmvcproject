package com.user.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.user.vo.ContactInfo;

@Repository
public class ContactInfoDao {
	 
	@Autowired
	private JdbcTemplate template;
	
	public void contactInfo(ContactInfo info)throws Exception{
		Object[] obj = new Object[5];
		obj[1] = info.getAddress();
		obj[2] = info.getCity();
		obj[3] = info.getState();
		obj[4] = info.getCountry();
		obj[5] = info.getPhoneNumber();
		
		this.template.update("INSERT INTO bank.contactinfo(address,city,state,country,phonenumber)"+" VALUES(?,?,?,?,?), obj");
		
	}

}
