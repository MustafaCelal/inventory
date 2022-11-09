package com.fiba.inventory.presentation.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fiba.inventory.business.dto.ProductDto;
import com.fiba.inventory.business.service.ProductService;


@RestController
public class ProductController {
	
	private ProductService productService;
		
	ProductController(ProductService productService){
		this.productService=productService;
	}

	@GetMapping("/inventory/product/{id}")
	public ProductDto getProduct(@PathVariable("id")long productId) {
		ProductDto product = productService.find(productId);
		return product;
	}
	
	@GetMapping("/inventory/products/{categoryId}")
	public List<ProductDto> getProductsByCategory(@PathVariable("categoryId")long categoryId) {
		return productService.findAllByCategoryId(categoryId);
	}
	
	
	
	
	
	
	
	
//
//	@GetMapping("/api/product/{id}")
//	public ProductDto getProduct(@PathVariable("id")long productId) {
//		ProductDto product = productService.find(productId);
//		return product;
//	}
//	
//
//	@GetMapping("/api/products")
//	public List<ProductDto> getProductDtos() {
//		List<ProductDto> productDtos = productService.findAll();
//		return productDtos;
//	}
//	
//	@PostMapping("/api/product")
//	public ProductDto postProduct(@RequestBody ProductDto productDto) {
//	
//		long productId=productService.create(productDto);
//		productDto.setProductId(productId);
//		return productDto; 
//	}
//	
//	@PutMapping("/api/product")
//	public void putProduct(@RequestBody ProductDto productDto) {
//		productService.update(productDto);
//	}
//	
//	@DeleteMapping("/api/product/{id}")
//	public void deleteProduct(@PathVariable("id")long productId) {
//		productService.delete(productId);
//	}
}
