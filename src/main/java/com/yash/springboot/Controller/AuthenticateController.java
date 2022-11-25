//package com.yash.springboot.Controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.DisabledException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.yash.springboot.Confg.JwtUtils;
//import com.yash.springboot.Exception.BadCredentialException;
//import com.yash.springboot.Exception.ResourceNotFoundException;
//import com.yash.springboot.Model.Employee;
//import com.yash.springboot.Model.JwtResponse;
//import com.yash.springboot.Service.EmployeeService;
//
//@RestController
//public class AuthenticateController<JwtRequest> {
//
//	@Autowired
//	private AuthenticationManager AuthenticationManager;
//	
//	@Autowired
//	private JwtUtils jwtUtil;
//	
//	@Autowired
//	private JwtRequest jwtRequest;
//
//	@Autowired
//	private EmployeeService employeeService;
//
//	private Object jwtUtils;
//	
//	
//	//generate token
//	
//	@PostMapping("/generate-token")
//	public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) {
//		
//		try {
//			authenticate(((Employee) jwtRequest).getUsername(),(((Employee) jwtRequest).getPassword()));
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		
//		}
//		
//		UserDetails userDetails=this.employeeService.fetchUserByEmailId(((UserDetails) jwtRequest).getUsername());
//		
//		String token=((JwtUtils) this.jwtUtils).generateToken(userDetails);
//		
//		return ResponseEntity.ok(new JwtResponse(token));
//
//	
//	}
//	
//	private void authenticate (String username,String password) {
//		try {
//			
//			AuthenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username,password));	
//			
//		}
//		
//		catch(Exception e){
//			e.printStackTrace();
//			
//		}
//		
//		
//		
//	}
//}
