package com.soding.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.soding.assignment.dao.UserDao;
import com.soding.assignment.entity.User;
import java.util.Date;
/*
 *@author Gulam mustafa
 * 
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User finUserdById(int id) {
        return dao.findById(id);
    }

    @Override
    public User findUserByUserName(String sso) {
        User user = dao.findBySSO(sso);
        return user;
    }

    @Override
    public void saveUser(User createUser) {
        createUser.setPassword(passwordEncoder.encode(createUser.getPassword()));
        createUser.setCreationDate(new Date());
        createUser.setModificationDate(new Date());
        dao.save(createUser);
    }

    /*
	 * Since the method is running with Transaction, No need to call hibernate update explicitly.
	 * Just fetch the entity from db and update it with proper values within transaction.
	 * It will be updated in db once transaction ends. 
     */
    @Override
    public void updateUser(User user) {
        User updateUser = dao.findById(user.getId());
        if (updateUser != null) {
            updateUser.setSsoId(user.getSsoId());
            if (!user.getPassword().equals(updateUser.getPassword())) {
                updateUser.setPassword(passwordEncoder.encode(user.getPassword()));
            }
            updateUser.setFirstName(user.getFirstName());
            updateUser.setLastName(user.getLastName());
            updateUser.setEmail(user.getEmail());
            updateUser.setUserProfiles(user.getUserProfiles());
            updateUser.setModificationDate(new Date());
        }
    }

    @Override
    public void deleteUserByUserName(String sso) {
        dao.deleteBySSO(sso);
    }

    @Override
    public List<User> findAllUsers() {
        return dao.findAllUsers();
    }

    @Override
    public boolean isUserSSOUnique(Integer id, String sso) {
        User user = findUserByUserName(sso);
        return (user == null || ((id != null) && (user.getId() == id)));
    }

}
