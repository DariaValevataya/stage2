package com.valevataya.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter("/*")
public class AuthFilter implements Filter {
  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
    HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
    HttpSession session = httpRequest.getSession();
    String user = (String) session.getAttribute("user");
    if (user == null && httpRequest.getRequestURI().contains("/user/")) {
      httpResponse.sendRedirect("/login");
    } else {
      filterChain.doFilter(servletRequest, servletResponse);
    }
  }
}
