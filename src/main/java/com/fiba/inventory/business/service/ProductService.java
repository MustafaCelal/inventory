package com.fiba.inventory.business.service;

import java.util.List;

import com.fiba.inventory.business.dto.ProductDto;

public interface ProductService {

	List<ProductDto> findAllByCategoryId(long categoryId);
	
	ProductDto find(long productId);
	
	
	
	
//	long create(ProductDto productDto);
//	
//	void update(ProductDto productDto);
//	
//	ProductDto find(long productId);
//	
//	List <ProductDto> findAll();
//	
//	void delete(long productId);
}
