package com.user.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.user.vo.PersonalInfo;

@Repository
public class PersonalInfoDao {
	
	@Autowired 
	private JdbcTemplate template;
	
	public void addPersonalInfo(PersonalInfo info)throws Exception {
		Object[] obj = new Object[4];
		obj[1] = info.getFirstName();
		obj[2] = info.getLastName();
		obj[3] = info.getMiddleName();
		obj[4] = info.getGender();
		this.template.update("Insert Into bank.personal(firstname, lastname, middlename, gender)"+" VALUES  (?,?,?,?)", obj);
	}

}
