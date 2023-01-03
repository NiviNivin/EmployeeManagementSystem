package com.EmployeeManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EmployeeManagement.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
