package com.UserService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.UserService.Entity.Department;
import com.UserService.Entity.Product;
import com.UserService.Entity.Rating;
import com.UserService.Entity.ResponseTemplate;
import com.UserService.Entity.User;
import com.UserService.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	RestTemplate restTemplate;

	public User saveUser(User user) {
		return userRepo.save(user);
	}

	public ResponseTemplate getUserWithDepartment(Integer userId) {
		ResponseTemplate rt = new ResponseTemplate();
		User user = userRepo.findByUserId(userId);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/" +
		user.getDepartmentId(), Department.class);
		Rating rating = restTemplate.getForObject("http://RATING-SERVICE/rating/" + 
		user.getRatingId(), Rating.class);
		Product product = restTemplate.getForObject("http://PRODUCT-SERVICE/product/" +
		user.getProdId(), Product.class);
		rt.setUser(user);
		rt.setDepartment(department);
		rt.setRating(rating);
		rt.setProduct(product);
		return rt;
		
	} 
	

}
