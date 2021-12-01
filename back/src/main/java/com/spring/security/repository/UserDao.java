package com.spring.security.repository;

import com.spring.security.entity.User;

/**
 * Interface of the User DAO.
 */
public interface UserDao {

    /**
     * Register the user passes as input parameter and returns 1 if it is registered.
     *
     * @param user new user to register in the database.
     * @return 1 if the user id registered.
     */
    int register(final User user);
}
