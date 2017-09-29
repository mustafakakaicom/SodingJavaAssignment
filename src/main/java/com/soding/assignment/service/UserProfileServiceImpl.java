package com.soding.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.soding.assignment.dao.UserProfileDao;
import com.soding.assignment.entity.UserProfile;

/*
 *@author Gulam mustafa
 * 
 */
@Service("userProfileService")
@Transactional
public class UserProfileServiceImpl implements UserProfileService{
	
	@Autowired
	UserProfileDao dao;

    @Override
    public UserProfile findUserProfileByUserId(int id) {
     return dao.findById(id);
    }

    @Override
    public UserProfile findUserProfileByType(String type) {
       return dao.findByType(type);
    }

    @Override
    public List<UserProfile> findAll() {
        return dao.findAll();
    }
	
   
}
