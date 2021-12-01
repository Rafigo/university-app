package com.spring.security.services;

import com.spring.security.entity.User;

/**
 * Interface of the User Service.
 */
public interface UserService {

    /**
     * Register in teh database the user passed as input parameter and returns 1 if this user is well registered in the database.
     *
     * @param user new user that must be added to the database.
     */
    void register(final User user);
}
