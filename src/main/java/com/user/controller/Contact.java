package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.user.bo.ContactBo;
import com.user.vo.ContactInfo;


/**
 * This is controller for contact info
 * @author rittijapal
 *
 */

@RestController
public class Contact {
	
	@Autowired
	private ContactBo bo;
	
	@RequestMapping(value = "/addContactInfo",method=RequestMethod.POST)
	
	public ModelAndView addContactInfo( ContactInfo info) {
		 
		bo.contactInfoAdd(info);
			 return new ModelAndView("Bankinfo");
}
	
}
