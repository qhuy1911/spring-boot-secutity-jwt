package com.example.springjwt.springbootsecurityjwt.repository;

import com.example.springjwt.springbootsecurityjwt.models.ERole;
import com.example.springjwt.springbootsecurityjwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
