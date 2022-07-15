package com.consagrados.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consagrados.ecommerce.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
