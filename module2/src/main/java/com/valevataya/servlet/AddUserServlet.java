package com.valevataya.servlet;

import com.valevataya.entity.user.User;
import com.valevataya.entity.user.Warehouse;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/add")
public class AddUserServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.getRequestDispatcher("/addUser.jsp").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String firstname = req.getParameter("firstname");
    String lastname = req.getParameter("lastname");
    User user = new User(firstname, lastname);
    Warehouse.getInstance().addUser(user);
    req.setAttribute("user", user.toString());
    req.getRequestDispatcher("/addUser.jsp").forward(req, resp);
  }
}
