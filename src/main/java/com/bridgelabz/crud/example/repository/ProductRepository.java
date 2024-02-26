package com.bridgelabz.crud.example.repository;
import com.bridgelabz.crud.example.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer>{
	Product findByName(String name);
}