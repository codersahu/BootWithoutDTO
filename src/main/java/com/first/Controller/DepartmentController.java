package com.first.Controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.first.Entity.Department;
import com.first.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	/*
	 * Loggers are used to read any errors and exceptions coming in our methods or
	 * program so we can create this, we can create a logger method and get it from logger factory 
	 * and then we can use the logger reference in our any methods so we can cheque the any logs are coming in our methods 
	 */
	private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class); 
	
	
	//sending or saving data to database
	@PostMapping("/departments")
	public Department saveDepartment(@Valid @RequestBody Department department)
	{
		LOGGER.info("Inside saveDepartment of DepartmentController");
		return departmentService.saveDepartment(department);
		
	}
	
	//getting all the data from database 
	@GetMapping("/departments")
	public List<Department>fetchDepartmentList()
	{
		LOGGER.info("Inside fetchDepartmentList of DepartmentController");
		return departmentService.fetchDepartmentList();
	}
	
	//getting data by id
	@GetMapping("/departments/{departmentId}")
	public Department fetchDepartmentById(@PathVariable Long departmentId)
	{
		return departmentService.fetchDepartmentById(departmentId);
	
	}
	
	//delete data by id
	@DeleteMapping("/departments/{deleteIdData}")
	public String DeleteDepartmentById(@PathVariable Long deleteIdData)
	{
	    departmentService.DeleteDepartmentId(deleteIdData);
	    return "Department deleted successfully";
		
	}
	
	//update data by id
	@PutMapping("/departments/{updateIdData}")
	public Department updateDepartment(@PathVariable Long updateIdData,@RequestBody Department department )
	{
		return departmentService.updateDepartment(updateIdData,department);
		
	}
	
	//getting data by name
	@GetMapping("/departments/name/{departmentName}")
	public Department fetchDepartmentByName(@PathVariable String departmentName)
	{
		return departmentService.fetchDepartmentByName(departmentName);
		
	}

}
