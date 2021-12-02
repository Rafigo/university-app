package com.spring.security.repository;

import com.spring.security.entity.User;
import com.spring.security.exception.UserExistsException;

import java.util.Optional;

/**
 * Interface of the User DAO.
 */
public interface UserDao {

    /**
     * Returns the user whose the login is passed as input parameter.
     *
     * @param login login of the user we search in the database.
     * @return the user whose the login is passed as input parameter, or if not found the Optional.empty().
     */
    Optional<User> get(final String login);

    /**
     * Register the user passes as input parameter and returns 1 if it is registered.
     *
     * @param user new user to register in the database.
     * @return 1 if the user id registered.
     */
    int add(final User user) throws UserExistsException;
}
