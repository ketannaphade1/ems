package com.yash.springboot.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.yash.springboot.Exception.ResourceNotFoundException;
import com.yash.springboot.Model.Employee;
import com.yash.springboot.Repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	public Employee loginEmployee(@RequestBody Employee employee) throws Exception {
		
		
		String tempEmailId = employee.getEmailId();
		
		String tempPassword = employee.getPassword();
		

		
//String tempPassword = this.bCryptPasswordEncoder.encode(employee.getPassword());
		


		//for encryption of password
		

		Employee empObj = null;

		if (tempEmailId != null && tempPassword != null) {

			empObj = employeeRepository.findByEmailIdAndPassword(tempEmailId, tempPassword);

			
		}

		if (empObj == null) {

			throw new Exception("Bad Credentials");
			// ResponseEntity.badRequest();
		}

		return empObj;

	}

	public Employee registerNewEmployee(@RequestBody Employee employee) throws Exception {

		String tempEmailId = employee.getEmailId();
		

		if (tempEmailId != null && !"".equals(tempEmailId)) {

			Employee empobj = employeeRepository.findByEmailId(tempEmailId);

			if (empobj != null) {
				try {
					throw new Exception("User with" + tempEmailId + "is already Exists");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		Employee empobj = null;
		
//		employee.setPassword(this.bCryptPasswordEncoder.encode(employee.getPassword()));

		empobj = saveEmployee(employee);
		return empobj;
	}
	

	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();

	}

	public Employee fetchEmployeeByEmailIdAndPassword(String emailId,String password) {
		return employeeRepository.findByEmailIdAndPassword(emailId, password);

	}
	
	
	public Employee saveEmployee(@RequestBody Employee employee) {
		
		return employeeRepository.save(employee);
	}
	
	public Employee fetchUserByEmailId(String emailId) {
		
		return employeeRepository.findByEmailId(emailId);
	}
	
	


//	public ResponseEntity<Employee> userLogin(@RequestBody Employee employeedata) {
//		Employee employee=employeeRepository.findById(employeedata.getPassword());
//		
//		if(employee.getPassword().equals(employeedata.getPassword())) {
//			
//			return ResponseEntity.ok(employee);
//		}
//		
//		return (ResponseEntity<Employee>) ResponseEntity.badRequest();
//
//	}

	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id) {

		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("user is not valid with id" + id));

//		return ResponseEntity.status(HttpStatus.CREATED).build();
		
		 return ResponseEntity.ok(employee);
		 
	}

	
	public ResponseEntity<Employee> updateEmployee(@PathVariable Integer id, @RequestBody Employee employeeDetails) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

		employee.setFirstName(employeeDetails.getFirstName());
		employee.setLastName(employeeDetails.getLastName());
		employee.setEmailId(employeeDetails.getEmailId());

		Employee updatedEmployee = employeeRepository.save(employee);
		return ResponseEntity.ok(updatedEmployee);
	}

	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Integer id) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

		employeeRepository.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

	
}
