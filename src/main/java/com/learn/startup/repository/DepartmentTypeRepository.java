package com.learn.startup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.startup.model.DepartmentType;

@Repository
public interface DepartmentTypeRepository extends JpaRepository<DepartmentType, Integer> {

}
