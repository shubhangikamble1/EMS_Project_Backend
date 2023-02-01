package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.serviceimpl.EmployeeServiceEmpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/ems/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceEmpl empService;
	
	@PostMapping("/onboard-new-employee")
	public Employee add(@RequestBody Employee emp)
	{
		return empService.addEmployee(emp);
	}
	@GetMapping("/get-all-onboard-employees-details")
	public List<Employee> getAll()
	{
		return empService.getAllEmp();
	}

}
/*
 *{
    "employeeId":1001,
	"employeeName":"ekta marathe",
	"grade":"E1",
	 "dob":"1970-12-11",
	"exprience":"2 years",
	"exprience_range":"ee",
	"base_location":"pune",
	"current_location":"pune"
}
*/
