package com.sathya.loginsevlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.sathya.javabean.JavaBean;

public class LoginServlet extends GenericServlet {
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("uname");
		String pass = request.getParameter("pwd");
		JavaBean b = new JavaBean();
		int x = b.checkLogin(name, pass);
		PrintWriter out = response.getWriter();
		if (x == 1) {
			out.println("<h1> Login successfull</h1>");
		} else {
			out.println("<h1>Login failed</h1>");
		}
	}

}
