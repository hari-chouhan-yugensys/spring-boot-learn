package com.learn.startup.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class DepartmentType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	@Column(name="departmentType")
	private String departmentTypeName;
	
	@OneToMany(mappedBy = "departmentType", fetch = FetchType.EAGER)
	private List<Department> departments;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartmentTypeName() {
		return departmentTypeName;
	}

	public void setDepartmentTypeName(String departmentTypeName) {
		this.departmentTypeName = departmentTypeName;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	
	
}
