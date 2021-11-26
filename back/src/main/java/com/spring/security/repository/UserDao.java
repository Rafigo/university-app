package com.spring.security.repository;

import com.spring.security.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<Role, Integer> {
}
