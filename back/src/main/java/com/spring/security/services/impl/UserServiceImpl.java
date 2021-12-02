package com.spring.security.services.impl;

import com.spring.security.entity.User;
import com.spring.security.exception.UserExistsException;
import com.spring.security.repository.UserDao;
import com.spring.security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User Service.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void register(User user) throws UserExistsException {
        userDao.add(user);
    }
}
