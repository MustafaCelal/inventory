package com.fiba.inventory.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.fiba.inventory.data.entity.Category;

public interface CategoryRepository extends CrudRepository<Category,Long>{

}
