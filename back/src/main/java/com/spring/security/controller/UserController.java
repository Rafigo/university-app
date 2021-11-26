package com.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class UserController {

    @GetMapping("/login")
    public String login() {
        return "Login Page";
    }

    @RolesAllowed({"USER", "ADMIN"})
    @GetMapping("/user")
    public String getUser() {
        return "Welcome User";
    }

    @RolesAllowed("ADMIN")
    @GetMapping("/admin")
    public String getAdmin() {
        return "Admin Page";
    }
}
