package com.user.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dao.BankInfoDao;
import com.user.vo.BankInfo;

@Service
public class BankBo {
	
	@Autowired
	private BankInfoDao dao;
	
	public void bankInfoAdd(BankInfo info) {
		
		try {
			dao.addBankinfo(info);
			System.out.println("Adding more logger");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
