package com.DepartmentService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DepartmentService.Entity.Department;
import com.DepartmentService.Repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepo;

	public Department saveDepartment(Department department) {
		return departmentRepo.save(department);
	}

	public Department getDepartmentByid(Integer departmentId) {
		return departmentRepo.findById(departmentId).get();
	}

}
