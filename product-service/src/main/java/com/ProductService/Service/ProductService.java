package com.ProductService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProductService.Entity.Product;
import com.ProductService.Repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepo;

	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}

	public Product getProductById(Integer prodId) {
		return productRepo.findById(prodId).get();
	}

}
