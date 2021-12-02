package com.spring.security.exception;

public class UserExistsException extends Exception {

    private final static String MESSAGE_GENERIQUE = "User with the login %s exists already in the database";

    private String message;

    public UserExistsException (final String login) {
        super();
        this.message = String.format(MESSAGE_GENERIQUE, login);
    }

    @Override
    public String getMessage() {
        return message;
    }
}
