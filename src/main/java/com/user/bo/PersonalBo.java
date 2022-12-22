package com.user.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dao.PersonalInfoDao;
import com.user.vo.PersonalInfo;

@Service
public class PersonalBo {
	@Autowired
	private PersonalInfoDao dao;
	
	public void personalInfoAdd(PersonalInfo info) {
		try {
			dao.addPersonalInfo(info);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
