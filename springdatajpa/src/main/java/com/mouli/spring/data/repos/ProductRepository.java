package com.mouli.spring.data.repos;

import org.springframework.data.repository.CrudRepository;

import com.mouli.spring.data.entities.Product;
import java.util.List;


public interface ProductRepository extends CrudRepository<Product, Long> {
	
	List<Product> findByPrice(Double price);
	List<Product> findByName(String name);
	
	List<Product> findByNameAndPrice(String name, Double price);
}
