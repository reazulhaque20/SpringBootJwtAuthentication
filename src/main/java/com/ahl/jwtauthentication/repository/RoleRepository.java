package com.ahl.jwtauthentication.repository;

import java.util.Optional;

import com.ahl.jwtauthentication.model.Role;
import com.ahl.jwtauthentication.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}