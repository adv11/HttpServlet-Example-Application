package com.register;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class RegistrationServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("<h2>Welcome to Registration Portal</h2>");
		
		// getting data out of request
		String userNameString = req.getParameter("user_name");
		String userEmailString = req.getParameter("user_email");
		String userGenderString = req.getParameter("user_gender");
		String userCourseString = req.getParameter("user_course");
		String conditionString = req.getParameter("condition");
		
		if(conditionString != null) {
			printWriter.println("<h2> User's name is : " + userNameString + "</h2>");
			printWriter.println("<h2> User's email is : " + userEmailString + "</h2>");
			printWriter.println("<h2> User's gender is : " + userGenderString + "</h2>");
			printWriter.println("<h2> User's course is : " + userCourseString + "</h2>");
		}else {
			printWriter.println("<h2>You have not accepted our terms and conditions</h2>");
		}
	}
}