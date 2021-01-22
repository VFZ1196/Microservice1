package com.DepartmentService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DepartmentService.Entity.Department;
import com.DepartmentService.Service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentSer;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentSer.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department getDepartmentByid(@PathVariable("id") Integer departmentId) {
		return departmentSer.getDepartmentByid(departmentId);
	}

}
