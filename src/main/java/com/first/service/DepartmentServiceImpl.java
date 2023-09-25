package com.first.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.Entity.Department;
import com.first.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> fetchDepartmentList() {
		return departmentRepository.findAll();
	}

	@Override
	public Department fetchDepartmentById(Long departmentId) {
		return departmentRepository.findById(departmentId).get();
	}

	@Override
	public void DeleteDepartmentId(Long deleteIdData) {
		departmentRepository.deleteById(deleteIdData);

	}

	@Override
	public Department updateDepartment(Long updateIdData, Department department) {
		Department depdb = departmentRepository.findById(updateIdData).get();
		if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
			depdb.setDepartmentName(department.getDepartmentName());
		}

		if (Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
			depdb.setDepartmentAddress(department.getDepartmentAddress());
		}

		if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
			depdb.setDepartmentCode(department.getDepartmentCode());
		}
		return departmentRepository.save(depdb);
	}

	@Override
	public Department fetchDepartmentByName(String departmentName) {
		return departmentRepository.findByDepartmentName(departmentName);
	}

}
