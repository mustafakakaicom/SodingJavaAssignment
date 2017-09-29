package com.soding.assignment.dao;

import java.util.List;
import com.soding.assignment.entity.UserProfile;

/*
 *@author Gulam mustafa
 * 
 */
public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
