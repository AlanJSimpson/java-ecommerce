package com.consagrados.ecommerce.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consagrados.ecommerce.entities.Product;
import com.consagrados.ecommerce.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductsResource {

	@Autowired
	ProductService productService;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> products = productService.findAll();
		return ResponseEntity.ok().body(products);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = productService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
