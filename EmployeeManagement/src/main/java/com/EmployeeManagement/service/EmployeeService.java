package com.EmployeeManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeManagement.dao.EmployeeDao;
import com.EmployeeManagement.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	public EmployeeDao edao;
	
	 public Employee addEmployee(Employee e) {
		 return edao.save(e);
	 }
	 
	 public Employee getEmployee(int empId) {
		 return edao.findById(empId).orElse(null);
	 }
	 public List<Employee> getAllEmployee(){
		 return edao.findAll();
	 }
	 public Employee updateEmployee(Employee e) {
		 Employee e1 = edao.findById(e.getEmpId()).orElse(null);
		 if(e1!= null) {
			 e1.setEmpName(e.getEmpName());
			 e1.setEmpMob(e.getEmpMob());
			 e1.setEmpDept(e.getEmpDept());
			 e1.setEmpDesg(e.getEmpDesg());
			 e1.setEmpDoj(e.getEmpDoj());
			 e1.setEmpSal(e.getEmpSal());
		 }
		 return edao.save(e1);
	 }
	 public String deleteEmployee(int empId) {
		 Employee e1 = edao.findById(empId).orElse(null);
		 if(e1!= null) {
			 edao.delete(e1);
			 return "Employee Deleted Sucessfully";
		 }
		 else {
			 return "Employee not available"; 
		 }
		 
	 }
}
