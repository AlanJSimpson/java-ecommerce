package com.consagrados.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consagrados.ecommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
