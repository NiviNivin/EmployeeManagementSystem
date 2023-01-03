package com.EmployeeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeManagement.model.Employee;
import com.EmployeeManagement.service.EmployeeService;

@RestController
@RequestMapping("/admin/")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
	
	@Autowired
	private EmployeeService eservice;
	
	@PostMapping("employee")
	public Employee addEmployee(@RequestBody Employee e) {
		return eservice.addEmployee(e);
	}
	
	@GetMapping("employee/{empId}")
	public Employee getEmployee(@PathVariable int empId) {
		return eservice.getEmployee(empId);
	}
	
	@GetMapping("employee")
	public List<Employee> getAllEmployee(){
		return eservice.getAllEmployee();
	}
	
	@PutMapping("employee")
	public Employee updateEmployee(@RequestBody Employee e) {
		return eservice.updateEmployee(e);
	}
	
	@DeleteMapping("employee/{empId}")
	public String deleteEmployee(@PathVariable int empId) {
		return eservice.deleteEmployee(empId);
	}
	
}
