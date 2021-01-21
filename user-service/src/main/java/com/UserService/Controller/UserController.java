package com.UserService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UserService.Entity.ResponseTemplate;
import com.UserService.Entity.User;
import com.UserService.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userSer; 
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		return userSer.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplate getUserWithDepartment(@PathVariable("id") Integer userId) {
		return userSer.getUserWithDepartment(userId);
	}
	

}
