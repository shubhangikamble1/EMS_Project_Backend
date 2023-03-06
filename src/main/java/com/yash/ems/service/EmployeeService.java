

package com.yash.ems.service;

import java.util.List;
import java.util.Optional;

import com.yash.ems.model.Employee;
import com.yash.ems.model.Evaluation;
import com.yash.ems.payloads.EmployeeDto;

public interface EmployeeService {
	
	public Employee addEmployee(Employee emp);
	
	public List<Employee> getAllEmp();
	
	void deleteEmployee(Integer employeeId);
	
	public Employee updateEmployee(Employee employeeDto,Integer emmployeeId);;

	
	public Optional<Employee> getEmployeeById(Integer employeeId);
	
	public Employee findByEmployeeIdAndEmployeeName(Integer employeeId,String employeeName);
	
	public EmployeeDto searchByEmployeeIdAndEmployeeName(Integer employeeId,String employeeName);
	
	public Evaluation addEvatuationDetailsById(Integer employeeId, Evaluation eva);

}
