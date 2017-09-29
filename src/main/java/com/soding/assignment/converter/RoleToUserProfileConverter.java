package com.soding.assignment.converter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.soding.assignment.entity.UserProfile;
import com.soding.assignment.service.UserProfileService;

/**
 * A converter class used in views to map id's to actual userProfile objects.
 *
 *@author Gulam mustafa
 * 
 */
@Component
public class RoleToUserProfileConverter implements Converter<Object, UserProfile>{

	static final Logger logger = LoggerFactory.getLogger(RoleToUserProfileConverter.class);
	
	@Autowired
	UserProfileService userProfileService;

	/**
	 * Gets UserProfile by Id
     * @param element
     * @return 
	 * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
	 */
        
        @Override
	public UserProfile convert(Object element) {
		Integer id = Integer.parseInt((String)element);
		UserProfile profile= userProfileService.findUserProfileByUserId(id);
		logger.info("Profile : {}",profile);
		return profile;
	}
	
}