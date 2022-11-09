package com.fiba.inventory.business.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fiba.inventory.business.dto.ProductDto;
import com.fiba.inventory.data.entity.Product;
import com.fiba.inventory.data.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	private ProductRepository productRepository;
	
	ProductServiceImpl(ProductRepository productRepository){
		this.productRepository = productRepository;
	}

	@Override
	public List<ProductDto> findAllByCategoryId(long categoryId) {
		List<ProductDto> result=new ArrayList<>();
		Iterable<Product> products = productRepository.findAllByCategoryId(categoryId);
		
		for(Product product:products) {
			ProductDto productDto = new ProductDto();
			
			productDto.setProductId(product.getProductId());
			productDto.setProductName(product.getProductName());
			productDto.setSalesPrice(product.getSalesPrice());
			
			result.add(productDto);
		}
		
		return result;
	} 
	

	@Override
	public ProductDto find(long productId) {
		
		Optional<Product> optional = productRepository.findById(productId);
		ProductDto productDto = new ProductDto();
		
		if(optional.isPresent()) {
			Product product=optional.get();	
			
			productDto.setProductId(product.getProductId());
			productDto.setProductName(product.getProductName());
			productDto.setSalesPrice(product.getSalesPrice());
		}
		
		return productDto;
	}
	
	
	
	
	
	
	
	
	
//	@Override
//	public long create(ProductDto productDto) {
//	
//		Product product = new Product();
//		product.setProductName(productDto.getProductName());
//		product.setSalesPrice(productDto.getSalesPrice());
//		
//		productRepository.save(product);
//		return product.getProductId();
//	}
//
//	@Override
//	public void update(ProductDto productDto) {
//		Product product = new Product();
//		product.setProductId(productDto.getProductId());
//		product.setProductName(productDto.getProductName());
//		product.setSalesPrice(productDto.getSalesPrice());
//		
//		productRepository.save(product);
//	}
//
//	@Override
//	public ProductDto find(long productId) {
//		
//		Optional<Product> optional = productRepository.findById(productId);
//		
//		if(optional.isPresent()) {
//			Product product=optional.get();
//			
//			ProductDto productDto = new ProductDto();
//			productDto.setProductName(product.getProductName());
//			productDto.setSalesPrice(product.getSalesPrice());
//			
//			
//			return productDto; 
//		}
//		
//		return null;
//	}
//
//	@Override
//	public List<ProductDto> findAll() {
//		List<ProductDto> productDtos=new ArrayList<>();
//		Iterable<Product> products = productRepository.findAll();
//		
//		for(Product product:products) {
//			ProductDto productDto = new ProductDto();
//			productDto.setProductName(product.getProductName());
//			productDto.setSalesPrice(product.getSalesPrice());
//			
//			productDtos.add(productDto);
//		}
//		
//		return productDtos;
//	}
//
//
//	@Override
//	public void delete(long productId) {
//		productRepository.deleteById(productId);
//	}
	
//	private Product toEntity(ProductDto dto) {
//		return null;
//	}
//
//	private ProductDto toDto(Product entity) {
//		return null;
//	}
}
