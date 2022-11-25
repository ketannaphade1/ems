//package com.yash.springboot.Confg;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//import com.yash.springboot.Service.EmployeeService;
//
//@Configuration
//@EnableWebSecurity
////@EnableGlobalMethodSecurity(prePostEnabled=true)
//
//class MySecurityConfig extends WebSecurityConfigurerAdapter {
//
//	private UserDetailsService userDetailsService;
//	
//	@Bean
//	public DaoAuthenticationProvider authenticationProvider() 
//	{
//		
//		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
//		
//	
//		provider.setUserDetailsService(userDetailsService());
//		provider.setPasswordEncoder(new BCryptPasswordEncoder());
//
//		
//		return provider;
//		
//		
//	}
//	
//	
//	
////	@Autowired
////	private JwtAuthenticationEntryPoint unauthorizedHandler;
////	
////	@Autowired
////	
////	private JwtAuthenticationFilter jwtAuthenticationFilter;
////	
////	@Autowired
////	private CustomerDetailsService userDetailsService;
////	
////	@Autowired
////	private JwtAuthenticationEntryPoint unAuthorisedHandler; 
//	
//	
//	@Override
//	public void configure(AuthenticationManagerBuilder auth) throws Exception{
//		auth.userDetailsService(userDetailsService());
//		
//	}
//	
//	
////	@Override
////	@Bean
////	public AuthenticationManager authenticationManagerBean() throws Exception {
////	    return super.authenticationManagerBean();
////	}
////
////	@Bean
////	public BCryptPasswordEncoder passwordEncoder() {
////		
////		return new BCryptPasswordEncoder();
////		
////	}
////	
////	
////
////	@Bean
////
////	
////
////
////	
////
////	@Override
////	public void configure(HttpSecurity http) throws Exception{
////		
////		
////		http
////		.csrf()
////		.disable()
////		.authorizeRequests()
////		
//////		.antMatchers("/admin/**").hasRole("ADMIN")
//////		.antMatchers("/employee/**").hasRole("USER")
////		.antMatchers("/generate-token/","/user/").permitAll()
////		.antMatchers(HttpMethod.OPTIONS).permitAll()
////		.anyRequest().authenticated()
////		.and()
////		.exceptionHandling().authenticationEntryPoint(unAuthorisedHandler)
////		.and()
////		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
////	
////
////		
////		http.addFilterBefore(jwtAuthenticationFilter, JwtAuthenticationFilter.class);
////		
////		
////	}
////	
////		
////	
//	
//	
//}
