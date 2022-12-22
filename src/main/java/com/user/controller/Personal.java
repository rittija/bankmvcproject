package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.user.bo.PersonalBo;
import com.user.vo.PersonalInfo;

@RestController
public class Personal {

	@Autowired
	private PersonalBo bo;
	
	@RequestMapping(value = "/welcome", method=RequestMethod.GET)
	public ModelAndView  welcome() {
		  
		 return new ModelAndView("Personalinfo");
	}
	
	@RequestMapping(value = "/addPersonInfo", method=RequestMethod.POST)
	public ModelAndView addPersonalInfo(PersonalInfo info) {
		bo.personalInfoAdd(info);
		return new ModelAndView("Contactinfo");
	}
	
}
