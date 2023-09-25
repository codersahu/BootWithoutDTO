package com.first.service;

import java.util.List;

import com.first.Entity.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentById(Long departmentId);

	public void DeleteDepartmentId(Long deleteIdData);

	public Department updateDepartment(Long updateIdData, Department department);

	public Department fetchDepartmentByName(String departmentName);

}
