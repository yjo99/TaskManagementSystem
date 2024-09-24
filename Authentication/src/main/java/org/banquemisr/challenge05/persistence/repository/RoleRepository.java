package org.banquemisr.challenge05.persistence.repository;


import org.banquemisr.challenge05.persistence.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByAuthRole(String roleName);

}
