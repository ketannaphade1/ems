package com.yash.springboot.Model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name="employees")
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	

	private String firstName;
	
	
	private String lastName;
	
	private String userName;
	

	private String emailId;
	
	private String password;
	
	private String middleName;
	
	private String pAddress;
	
	private String corresponsenceAddress;
	
	private String yearsOfExp;
	
	private String mobNumber;
	
	private String lastorg;
	
	
	private String token;
	
	private String secondlastorg;
	
	private String currentCtc;
	
	private String emergencyContact;
	
	private String currentRole;
	
	private String keyskill1;
	
	private String keyskill2;

	private String keyskill3;
	
	private String keyskill4;
	
	private String salary;
	
	int isAdmin;




	public Employee() {
		super();
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}




	public String getEmailId() {
		return emailId;
	}




	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getMiddleName() {
		return middleName;
	}




	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}




	public String getpAddress() {
		return pAddress;
	}




	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}




	public String getCorresponsenceAddress() {
		return corresponsenceAddress;
	}




	public void setCorresponsenceAddress(String corresponsenceAddress) {
		this.corresponsenceAddress = corresponsenceAddress;
	}




	public String getYearsOfExp() {
		return yearsOfExp;
	}




	public void setYearsOfExp(String yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
	}




	public String getMobNumber() {
		return mobNumber;
	}




	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}




	public String getLastorg() {
		return lastorg;
	}




	public void setLastorg(String lastorg) {
		this.lastorg = lastorg;
	}




	public String getSecondlastorg() {
		return secondlastorg;
	}




	public void setSecondlastorg(String secondlastorg) {
		this.secondlastorg = secondlastorg;
	}




	public String getCurrentCtc() {
		return currentCtc;
	}




	public void setCurrentCtc(String currentCtc) {
		this.currentCtc = currentCtc;
	}




	public String getEmergencyContact() {
		return emergencyContact;
	}




	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}




	public String getCurrentRole() {
		return currentRole;
	}




	public void setCurrentRole(String currentRole) {
		this.currentRole = currentRole;
	}




	public String getKeyskill1() {
		return keyskill1;
	}




	public void setKeyskill1(String keyskill1) {
		this.keyskill1 = keyskill1;
	}




	public String getKeyskill2() {
		return keyskill2;
	}




	public void setKeyskill2(String keyskill2) {
		this.keyskill2 = keyskill2;
	}




	public String getKeyskill3() {
		return keyskill3;
	}




	public void setKeyskill3(String keyskill3) {
		this.keyskill3 = keyskill3;
	}




	public String getKeyskill4() {
		return keyskill4;
	}




	public void setKeyskill4(String keyskill4) {
		this.keyskill4 = keyskill4;
	}




	public String getSalary() {
		return salary;
	}




	public void setSalary(String salary) {
		this.salary = salary;
	}




	public int getIsAdmin() {
		return isAdmin;
	}




	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}




	public Employee(int id, String firstName, String lastName, String userName, String emailId, String password,
			String middleName, String pAddress, String corresponsenceAddress, String yearsOfExp, String mobNumber,
			String lastorg, String secondlastorg, String currentCtc, String emergencyContact, String currentRole,
			String keyskill1, String keyskill2, String keyskill3, String keyskill4, String salary, int isAdmin) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
		this.middleName = middleName;
		this.pAddress = pAddress;
		this.corresponsenceAddress = corresponsenceAddress;
		this.yearsOfExp = yearsOfExp;
		this.mobNumber = mobNumber;
		this.lastorg = lastorg;
		this.secondlastorg = secondlastorg;
		this.currentCtc = currentCtc;
		this.emergencyContact = emergencyContact;
		this.currentRole = currentRole;
		this.keyskill1 = keyskill1;
		this.keyskill2 = keyskill2;
		this.keyskill3 = keyskill3;
		this.keyskill4 = keyskill4;
		this.salary = salary;
		this.isAdmin = isAdmin;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", emailId=" + emailId + ", password=" + password + ", middleName=" + middleName + ", pAddress="
				+ pAddress + ", corresponsenceAddress=" + corresponsenceAddress + ", yearsOfExp=" + yearsOfExp
				+ ", mobNumber=" + mobNumber + ", lastorg=" + lastorg + ", secondlastorg=" + secondlastorg
				+ ", currentCtc=" + currentCtc + ", emergencyContact=" + emergencyContact + ", currentRole="
				+ currentRole + ", keyskill1=" + keyskill1 + ", keyskill2=" + keyskill2 + ", keyskill3=" + keyskill3
				+ ", keyskill4=" + keyskill4 + ", salary=" + salary + ", isAdmin=" + isAdmin + "]";
	}


	
	
	
	

		}