package com.ProductService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProductService.Entity.Product;
import com.ProductService.Service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/")
	public Product saveProduct(@RequestBody Product prodId) {
		return productService.saveProduct(prodId);
	}
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable("id") Integer prodId) {
		return productService.getProductById(prodId);
	}

}
