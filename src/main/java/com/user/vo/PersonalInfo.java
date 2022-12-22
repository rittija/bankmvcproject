package com.user.vo;

import java.io.Serializable;

public class PersonalInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private String firstName;
    private String lastName;
    private String middleName;
    private String gender;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
    
    
}