package com.consagrados.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consagrados.ecommerce.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
