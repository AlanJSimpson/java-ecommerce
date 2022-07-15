package com.consagrados.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consagrados.ecommerce.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
