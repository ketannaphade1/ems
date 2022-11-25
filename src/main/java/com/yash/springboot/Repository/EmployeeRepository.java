package com.yash.springboot.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.springboot.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	public Employee findById(int id);

	public Employee findByEmailId(String email);
	
	public Employee findByEmailIdAndPassword(String emailId,String password);


	

	 
	
	
}
