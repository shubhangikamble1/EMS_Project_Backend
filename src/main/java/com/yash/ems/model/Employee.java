package com.yash.ems.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private int employeeId;
	private String employeeName;
	private String grade;
	// @JsonFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date dob;
	// @JsonFormat(pattern="yyyy-MM-dd")
	 @Temporal(TemporalType.DATE) 
	private Date dateOfJoining;
	
	
	private String mobileNo;;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private String email;
	
	private String exprience;
	private String exprienceInYash;
	private String totalExprience;
	
	private String baseLocation;
	private String currentLocation;
	private String primarySkills;
	private String secondarySkills;
	
	private String frontendSpecialization;
	private String cloudTech;


	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "evaluatin_emp_fk")
	private List<Evaluation> evaluation;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, String grade, Date dob, Date dateOfJoining, String mobileNo,
			String email, String exprience, String exprienceInYash, String totalExprience, String baseLocation,
			String currentLocation, String primarySkills, String secondarySkills, String frontendSpecialization,
			String cloudTech, List<Evaluation> evaluation) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.grade = grade;
		this.dob = dob;
		this.dateOfJoining = dateOfJoining;
		this.mobileNo = mobileNo;
		this.email = email;
		this.exprience = exprience;
		this.exprienceInYash = exprienceInYash;
		this.totalExprience = totalExprience;
		this.baseLocation = baseLocation;
		this.currentLocation = currentLocation;
		this.primarySkills = primarySkills;
		this.secondarySkills = secondarySkills;
		this.frontendSpecialization = frontendSpecialization;
		this.cloudTech = cloudTech;
		this.evaluation = evaluation;
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

	public String getExprience() {
		return exprience;
	}

	public void setExprience(String exprience) {
		this.exprience = exprience;
	}

	public String getExprienceInYash() {
		return exprienceInYash;
	}

	public void setExprienceInYash(String exprienceInYash) {
		this.exprienceInYash = exprienceInYash;
	}

	public String getTotalExprience() {
		return totalExprience;
	}

	public void setTotalExprience(String totalExprience) {
		this.totalExprience = totalExprience;
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

	public String getPrimarySkills() {
		return primarySkills;
	}

	public void setPrimarySkills(String primarySkills) {
		this.primarySkills = primarySkills;
	}

	public String getSecondarySkills() {
		return secondarySkills;
	}

	public void setSecondarySkills(String secondarySkills) {
		this.secondarySkills = secondarySkills;
	}

	public String getFrontendSpecialization() {
		return frontendSpecialization;
	}

	public void setFrontendSpecialization(String frontendSpecialization) {
		this.frontendSpecialization = frontendSpecialization;
	}

	public String getCloudTech() {
		return cloudTech;
	}

	public void setCloudTech(String cloudTech) {
		this.cloudTech = cloudTech;
	}

	public List<Evaluation> getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(List<Evaluation> evaluation) {
		this.evaluation = evaluation;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", grade=" + grade + ", dob="
				+ dob + ", dateOfJoining=" + dateOfJoining + ", mobileNo=" + mobileNo + ", email=" + email
				+ ", exprience=" + exprience + ", exprienceInYash=" + exprienceInYash + ", totalExprience="
				+ totalExprience + ", baseLocation=" + baseLocation + ", currentLocation=" + currentLocation
				+ ", primarySkills=" + primarySkills + ", secondarySkills=" + secondarySkills
				+ ", frontendSpecialization=" + frontendSpecialization + ", cloudTech=" + cloudTech + ", evaluation="
				+ evaluation + "]";
	}

	
	
}
