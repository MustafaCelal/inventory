package com.fiba.inventory.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.fiba.inventory.data.entity.Product;

public interface ProductRepository extends CrudRepository<Product,Long>{
	
	@Query("select p from Product as p where p.category.categoryId = :categoryId")
	List<Product> findAllByCategoryId(@Param("categoryId") long categoryId);
	
}
