package com.valevataya.servlet;

import com.valevataya.Users;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    HttpSession session = req.getSession();
    if (session.getAttribute("user") == null) {
      req.getRequestDispatcher("/login.jsp").forward(req, resp);
    } else {
      req.getRequestDispatcher("/user/hello.jsp").forward(req, resp);
    }
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    HttpSession session = req.getSession();
    String login = req.getParameter("login");
    String password = req.getParameter("pass");
    if (Users.getInstance().getUsers().contains(login) && !password.isEmpty()) {
      session.setAttribute("user", login);
      resp.sendRedirect("/user/hello.jsp");
    } else {
      resp.sendRedirect("/login");
    }
  }
}
