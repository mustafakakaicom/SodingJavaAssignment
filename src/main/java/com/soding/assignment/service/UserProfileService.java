package com.soding.assignment.service;

import java.util.List;
import com.soding.assignment.entity.UserProfile;
/*
 *@author Gulam mustafa
 * 
 */

public interface UserProfileService {

	UserProfile findUserProfileByUserId(int id);

	UserProfile findUserProfileByType(String type);
	
	List<UserProfile> findAll();
	
}
