package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceEmpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public Employee addEmployee(Employee emp) {
		return empRepo.save(emp);
	}

	@Override
	public List<Employee> getAllEmp() {
		return empRepo.findAll();
	}

}
