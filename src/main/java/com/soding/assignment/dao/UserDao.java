package com.soding.assignment.dao;

import java.util.List;
import com.soding.assignment.entity.User;
/*
 *@author Gulam mustafa
 * 
 */

public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);
	
	void save(User user);
	
	void deleteBySSO(String sso);
	
	List<User> findAllUsers();

}

