package com.predoana.springboot.thymeleaf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.predoana.springboot.thymeleaf.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	//add method to sort by lasy name

	public List<Employee> findAllByOrderByLastNameAsc();
	
	
	
}
