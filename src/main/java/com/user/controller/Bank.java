package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.user.bo.BankBo;
import com.user.vo.BankInfo;

@RestController
public class Bank {
	
	@Autowired
	private BankBo bo;
	
	@RequestMapping(value = "/addBankInfo",method=RequestMethod.POST)
	public ModelAndView addBankInfo( BankInfo info) {
		System.out.print("entered bankInfo");
		  bo.bankInfoAdd(info);
			 return new ModelAndView("Success");
	}

}
