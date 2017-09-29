package com.soding.assignment.service;

import java.util.List;
import com.soding.assignment.entity.User;

/*
 *@author Gulam mustafa
 * 
 */
public interface UserService {
	
	User finUserdById(int id);
	
	User findUserByUserName(String userName);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserByUserName(String userName);

	List<User> findAllUsers(); 
	
	boolean isUserSSOUnique(Integer id, String sso);

}