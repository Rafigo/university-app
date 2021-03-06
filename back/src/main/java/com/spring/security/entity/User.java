package com.spring.security.entity;

/**
 * User defined by a login and a password (and a boolean indicating if the user is active or not).
 */
public class User {

    private String login;

    private String password;

    private boolean active = true;

    public User() {

    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.active = true;
    }

    public User(String login, String password, boolean active) {
        this.login = login;
        this.password = password;
        this.active = active;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
