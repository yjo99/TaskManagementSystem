package org.banquemisr.challenge05.persistence.repository;

import org.banquemisr.challenge05.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
