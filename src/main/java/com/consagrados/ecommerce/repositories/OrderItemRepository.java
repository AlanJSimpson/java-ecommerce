package com.consagrados.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consagrados.ecommerce.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
