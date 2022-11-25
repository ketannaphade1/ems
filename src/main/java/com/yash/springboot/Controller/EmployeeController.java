package com.yash.springboot.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.yash.springboot.Model.Employee;
import com.yash.springboot.Service.EmployeeService;

@RestController
@RequestMapping("/api")

//@CrossOrigin("http://localhost:4200/")
@CrossOrigin("*")
public class EmployeeController{

	@Autowired
	private EmployeeService employeeService;


	@GetMapping("/getAllEmployees")
//	@CrossOrigin("http://localhost:4200")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();

	}

	@PostMapping("/login")
//	@CrossOrigin("http://localhost:4200")
	public Employee loginEmployee(@RequestBody Employee employee) throws Exception {
		return employeeService.loginEmployee(employee);
		

	}

	// create employee rest api
	@PostMapping("/createemployee")
//	@CrossOrigin("http://localhost:4200/")

	public Employee registerNewEmployee(@RequestBody Employee employee) throws Exception {

		return employeeService.registerNewEmployee(employee);
	}

	@GetMapping("/getEmployeesById/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id) {

		return employeeService.getEmployeeById(id);

	}

	// update employee rest api

	@PutMapping("/updateEmployeesById/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Integer id, @RequestBody Employee employeeDetails) {

		return employeeService.updateEmployee(id, employeeDetails);
	}

	// delete employee rest api
	@DeleteMapping("/deleteEmployeesById/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Integer id) {

		return employeeService.deleteEmployee(id);
	}

	
	@GetMapping("/getEmployeesByemail/{emailId}")
	public Employee getEmployeeByEmailId(@PathVariable String emailId) {

		return employeeService.fetchUserByEmailId(emailId);

	}

	
}
