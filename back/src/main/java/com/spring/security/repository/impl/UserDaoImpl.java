package com.spring.security.repository.impl;

import com.spring.security.entity.User;
import com.spring.security.exception.UserExistsException;
import com.spring.security.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * User DAO.
 */
@Repository
public class UserDaoImpl implements UserDao {

    private final String FOUND_USER_BY_LOGIN_SQL = "select login, motdepasse, actif from utilisateurs where login = ?";

    private final String INSERT_NEW_USER_SQL = "insert into utilisateurs (login, motdepasse, actif) values(?, ?, ?)";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Optional<User> get(String login) {
        Object parameters = (String) login;
        return Optional.of(jdbcTemplate.queryForObject(FOUND_USER_BY_LOGIN_SQL,
                        (rs, rowNum) -> {
                            return new User(rs.getString("login"),rs.getString("motdepasse"),rs.getBoolean("actif"));
                        },
                        parameters
                ));
    }

    @Override
    public int add(User user) throws UserExistsException {
        try {
            get(user.getLogin());
            throw new UserExistsException(user.getLogin());
        } catch (final IncorrectResultSizeDataAccessException exception) {
            return jdbcTemplate.update(INSERT_NEW_USER_SQL, new Object[]{
                    user.getLogin(), passwordEncoder.encode(user.getPassword()), user.isActive()
            });
        }
    }
}
