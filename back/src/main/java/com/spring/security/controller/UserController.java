package com.spring.security.controller;

import com.spring.security.entity.User;
import com.spring.security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public void register(@RequestBody final User user) {
        userService.register(user);
    }

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
