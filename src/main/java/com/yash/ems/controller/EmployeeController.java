package com.yash.ems.controller;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.ems.model.Employee;
import com.yash.ems.model.Evaluation;
import com.yash.ems.payloads.ApiResponse;
import com.yash.ems.payloads.EmployeeDto;
import com.yash.ems.serviceimpl.EmployeeServiceEmpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/ems/employee")
public class EmployeeController {

	@Autowired
	private EmployeeServiceEmpl empService;

	DateTimeFormatter dtm = DateTimeFormatter.ofPattern("yyyy-dd-MM");

	@PostMapping("/onboard-new-employee")
	public ResponseEntity<Employee> saveEmpoyee( @Valid @RequestBody Employee employeeDto) {
		Employee saveEmployee=this.empService.addEmployee(employeeDto);
		return new ResponseEntity<Employee>(saveEmployee,HttpStatus.CREATED);
	}

	@GetMapping("/get-all-onboard-employees-details")
	public ResponseEntity<List<Employee>> getAll() {
		List<Employee> employee = this.empService.getAllEmp();
		return  ResponseEntity.ok(employee);
	}

	@GetMapping("/getDate")
	public void date(Employee emp) {
		empService.setDate(emp);
	}

	
	 
	@DeleteMapping("/delete-employee/{employeeId}")
	public ResponseEntity<Employee> deleteCategory(@PathVariable Integer employeeId) {
		empService.deleteEmployee(employeeId);

		return new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/{employeeId}")
	public ResponseEntity<Employee> getEmployeeDetailsById(@PathVariable Integer employeeId){
		Employee c=empService.getEmployeeById(employeeId).get();
	  	if(c!=null) {
	  		 return new ResponseEntity<Employee>(c,HttpStatus.OK);	
	  	}
	  	else
	   {
	  		return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
	  		
	  	}
	}

	@GetMapping("/employes-by/{employeeId}/evaluation")
	public ResponseEntity<Set<Evaluation>> getAllEvaluationByEmployeeId(
			@PathVariable(value = "employeeId") Integer employeeId) {
		Employee employee = empService.getEmployeeById(employeeId).get();

		Set<Evaluation> evaluations = new HashSet<Evaluation>();

		evaluations.addAll(employee.getEvaluation());

		return new ResponseEntity<>(evaluations, HttpStatus.OK);
	}

	@GetMapping("/find-by-id-name/{employeeId}/{employeeName}/evaluation")
	public ResponseEntity<Employee> findByEmployeeIdAndEmployeeName(
			@PathVariable(value = "employeeId") Integer employeeId,
			@PathVariable(value = "employeeName") String employeeName) {
		Employee employee = empService.findByEmployeeIdAndEmployeeName(employeeId, employeeName);

		
		List<Evaluation> evaluations = new ArrayList<Evaluation>();
 
		evaluations.addAll(employee.getEvaluation());
		

		return new ResponseEntity<>(employee, HttpStatus.OK);
	}
	
	@GetMapping("/serarch-by-id-name/{employeeId}/{employeeName}/evaluation")
	public ResponseEntity<EmployeeDto> searchByEmployeeIdAndEmployeeName(
			@PathVariable(value = "employeeId") Integer employeeId,
			@PathVariable(value = "employeeName") String employeeName) {
		EmployeeDto employee = empService.searchByEmployeeIdAndEmployeeName(employeeId, employeeName);

		
		List<Evaluation> evaluations = new ArrayList<Evaluation>();
 
		evaluations.addAll(employee.getEvaluation());
		

		return new ResponseEntity<>(employee, HttpStatus.OK);
	}
	
	
	
	@PutMapping("/addEvaluation/{employeeId}")
	public Evaluation addEval(@PathVariable Integer employeeId,@RequestBody Evaluation eval)
	{
		return empService.addEvatuationDetailsById(employeeId,eval);
	}
	
	
	@PutMapping("/updateEmpById/{id}")
	public Employee updateById(@RequestBody Employee emp, @PathVariable int id) {
		return empService.updateEmployee(emp, id);
	}

}





/*
 * { "employeeId":1001, "employeeName":"ekta marathe", "grade":"E1",
 * "dob":"1970-12-11", "exprience":"2 years", "exprience_range":"ee",
 * "base_location":"pune", "current_location":"pune" }
 */
