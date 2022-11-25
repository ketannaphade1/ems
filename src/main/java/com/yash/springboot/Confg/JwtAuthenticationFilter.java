//package com.yash.springboot.Confg;
//
//import java.io.IOException;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import com.yash.springboot.Service.EmployeeService;
//
//import io.jsonwebtoken.ExpiredJwtException;
//
//public class JwtAuthenticationFilter extends OncePerRequestFilter {
//
//	@Autowired
//	private JwtUtils jwtUtil;
//
//	@Autowired
//	private EmployeeService employeeService;
//
//	@Override
//	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//
//		final String requestTokenHeader = request.getHeader("authorization");
//		System.out.println(requestTokenHeader);
//
//		String username = null;
//		String jwtToken = null;
//
//		if (requestTokenHeader != null && requestTokenHeader.startsWith("Bearer ")) {
//
//			// yes
//			jwtToken = requestTokenHeader.substring(7);
//
//			try {
//				username = this.jwtUtil.extractUsername(jwtToken);
//			} catch (ExpiredJwtException e) {
//
//				e.printStackTrace();
//				System.out.println("jwt token expired");
//
//			} catch (Exception e) {
//				e.printStackTrace();
//
//				System.out.println("error");
//
//			}
//
//		} else {
//
//			System.out.println("Invalid Token");
//
//		}
//
//		if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//
//			final UserDetails userDetails = (UserDetails) this.employeeService.fetchUserByEmailId(username);
//
//			if (this.jwtUtil.validateToken(jwtToken, userDetails)) {
//
//				UsernamePasswordAuthenticationToken UsernamePasswordAuthenticationFilter = new UsernamePasswordAuthenticationToken(
//						userDetails, null, userDetails.getAuthorities());
//
//				UsernamePasswordAuthenticationFilter
//						.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//
//				SecurityContextHolder.getContext().setAuthentication(UsernamePasswordAuthenticationFilter);
//
//			}
//
//			else {
//
//				System.out.println("Token is not valid");
//
//			}
//
//			filterChain.doFilter(request, response);
//
//		}
//
//	}
//
//}
