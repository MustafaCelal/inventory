package com.fiba.inventory.presentation.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fiba.inventory.business.dto.CategoryDto;
import com.fiba.inventory.business.service.CategoryService;

@RestController
public class CategoryController {
	
	private CategoryService categoryService;
	
	CategoryController(CategoryService categoryService){
		this.categoryService =categoryService;
	}
	
	@GetMapping("/inventory/category/{id}")
	public CategoryDto getCategory(@PathVariable("id")long categoryId) {
		CategoryDto category = categoryService.find(categoryId);
		return category;
	}
	
	@GetMapping("/inventory/categories")
	public List<CategoryDto> getCategories() {
		List<CategoryDto> categories = categoryService.findAll();
		return categories;
	}
}
