package com.fiba.inventory.business.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fiba.inventory.business.dto.CategoryDto;
import com.fiba.inventory.data.entity.Category;
import com.fiba.inventory.data.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{

	private CategoryRepository categoryRepository;
	
	CategoryServiceImpl(CategoryRepository categoryRepository){
		this.categoryRepository =categoryRepository;
	}
	
	@Override
	public CategoryDto find(long categoryId) {
		Optional<Category> optional = categoryRepository.findById(categoryId);
		CategoryDto categoryDto = new CategoryDto();
		
		if(optional.isPresent()) {
			Category category=optional.get();	
			
			categoryDto.setCategoryId(category.getCategoryId());
			categoryDto.setCategoryName(category.getCategoryName());			
		}
		
		return categoryDto;
	}
	
	@Override
	public List<CategoryDto> findAll() {
		List<CategoryDto> categoryDtos = new ArrayList<>();
		
		Iterable<Category> categories= categoryRepository.findAll(); 
		
		
		for(Category category:categories) {
			CategoryDto categoryDto = new CategoryDto();
			
			categoryDto.setCategoryId(category.getCategoryId());
			categoryDto.setCategoryName(category.getCategoryName());
			
			categoryDtos.add(categoryDto);
		}
		
		return categoryDtos;
	}

}
