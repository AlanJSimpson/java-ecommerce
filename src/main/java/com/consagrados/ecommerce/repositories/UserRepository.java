package com.consagrados.ecommerce.repositories;

import com.consagrados.ecommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
