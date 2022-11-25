//package com.yash.springboot.Service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.yash.springboot.Exception.BadCredentialException;
//import com.yash.springboot.Model.Employee;
//import com.yash.springboot.Repository.EmployeeRepository;
//
//@Service
//public class CustomUserDetailService implements UserDetailsService {
//	
//	
//	@Autowired
//	private EmployeeRepository employeeRepository;
//	
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws BadCredentialException {
//		
//		Employee emp=employeeRepository.findByUserName(username);
//		
//		if(emp==null) {
//			
//			throw new BadCredentialException("User Not Found");
//			
//		}
//		
//		return null;
//	}
//
//}
