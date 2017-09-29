package com.soding.assignment.entity;

import java.io.Serializable;
/*
 *@author Gulam mustafa
 * 
 */
public enum UserProfileType implements Serializable{
	USER("user"),
	DBA("admin"),
	ADMIN("superAdministrator");
	
	String userProfileType;
	
	private UserProfileType(String userProfileType){
		this.userProfileType = userProfileType;
	}
	
	public String getUserProfileType(){
		return userProfileType;
	}
	
}
