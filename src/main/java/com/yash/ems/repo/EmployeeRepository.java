package com.yash.ems.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.ems.model.Employee;
import com.yash.ems.payloads.EmployeeDto;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	public Employee findByEmployeeIdAndEmployeeName(Integer employeeId, String employeeName);
	
	public Employee searchByEmployeeIdAndEmployeeName(Integer employeeId, String employeeName);

}
