package com.valevataya.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

import java.time.LocalDateTime;

@WebListener("/")
public class ContextListener implements ServletContextListener {
  @Override
  public void contextInitialized(ServletContextEvent sce) {
    LocalDateTime date = LocalDateTime.now();
    sce.getServletContext().setAttribute("servletTimeInit", date);
  }
}
