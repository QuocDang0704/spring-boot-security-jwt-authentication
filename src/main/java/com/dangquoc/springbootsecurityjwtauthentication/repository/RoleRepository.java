package com.dangquoc.springbootsecurityjwtauthentication.repository;

import com.dangquoc.springbootsecurityjwtauthentication.entity.ERole;
import com.dangquoc.springbootsecurityjwtauthentication.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
