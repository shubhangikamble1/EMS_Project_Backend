package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int employeeId;
	private String employeeName;
	private String grade;
	 @JsonFormat(pattern="yyyy-MM-dd")
	private Date dob;
	 @JsonFormat(pattern="yyyy-MM-dd")
	private Date dateOfJoining;
	private String exprience;
	private String mobileNo;;
	private String email;
	private String exprienceRange;
	private String baseLocation;
	private String currentLocation;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, String grade, Date dob, Date dateOfJoining, String exprience,
			String mobileNo, String email, String exprienceRange, String baseLocation, String currentLocation) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.grade = grade;
		this.dob = dob;
		this.dateOfJoining = dateOfJoining;
		this.exprience = exprience;
		this.mobileNo = mobileNo;
		this.email = email;
		this.exprienceRange = exprienceRange;
		this.baseLocation = baseLocation;
		this.currentLocation = currentLocation;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getExprience() {
		return exprience;
	}

	public void setExprience(String exprience) {
		this.exprience = exprience;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getExprienceRange() {
		return exprienceRange;
	}

	public void setExprienceRange(String exprienceRange) {
		this.exprienceRange = exprienceRange;
	}

	public String getBaseLocation() {
		return baseLocation;
	}

	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", grade=" + grade + ", dob="
				+ dob + ", dateOfJoining=" + dateOfJoining + ", exprience=" + exprience + ", mobileNo=" + mobileNo
				+ ", email=" + email + ", exprienceRange=" + exprienceRange + ", baseLocation=" + baseLocation
				+ ", currentLocation=" + currentLocation + "]";
	}

	
}
