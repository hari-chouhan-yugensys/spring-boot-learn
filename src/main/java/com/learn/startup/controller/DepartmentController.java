package com.learn.startup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.startup.model.Department;
import com.learn.startup.model.DepartmentType;
import com.learn.startup.repository.DepartmentRepository;
import com.learn.startup.repository.DepartmentTypeRepository;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@SecurityRequirement(name = "bearer-key") 
public class DepartmentController {

	@Autowired
	DepartmentTypeRepository departmentTypeRepository;
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@GetMapping("deparment")
	public List<Department> deparment() {
		return departmentRepository.findAll();
	}
	
	@GetMapping("deparmentType")
	public ResponseEntity<List<DepartmentType>> deparmentType() {
		List<DepartmentType> departments = departmentTypeRepository.findAll();
		 
		
		 return new ResponseEntity<>(departments, HttpStatus.OK);
		
	}
	
	
}
