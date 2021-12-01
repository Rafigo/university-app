package com.spring.security.repository.impl;

import com.spring.security.entity.User;
import com.spring.security.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

/**
 * User DAO.
 */
@Repository
public class UserDaoImpl implements UserDao {

    private final String INSERT_NEW_USER_SQL = "insert into public.utilisateurs (login, motdepasse, actif) values(?, ?, ?)";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public int register(User user) {
        return jdbcTemplate.update(INSERT_NEW_USER_SQL, new Object[]{
                user.getLogin(), passwordEncoder.encode(user.getPassword()), user.isActive()
        });
    }
}
