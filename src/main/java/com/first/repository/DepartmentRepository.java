package com.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.first.Entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
	public Department findByDepartmentName(String departmentName);



}
