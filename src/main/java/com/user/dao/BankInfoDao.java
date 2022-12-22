package com.user.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.user.vo.BankInfo;

@Repository
public class BankInfoDao {
	@Autowired
	private JdbcTemplate template;
	
	public void addBankinfo(BankInfo info) throws Exception{
		Object[] obj = new Object[3];
		obj[1] = info.getAccount();
		obj[2] = info.getBank();
		obj[3] = info.getSsn();
		this.template.update("INSERT INTO bank.bankinfo(bank, account, ssn)"+"VALUES(?,?,?), obj");
	}

}
