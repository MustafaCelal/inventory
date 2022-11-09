package com.fiba.inventory.business.service;

import java.util.List;

import com.fiba.inventory.business.dto.CategoryDto;

public interface CategoryService {
	
	CategoryDto find(long categoryId);
	
	List<CategoryDto> findAll();

}
