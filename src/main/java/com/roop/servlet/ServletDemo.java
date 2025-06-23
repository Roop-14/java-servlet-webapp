package com.roop.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet
public class ServletDemo extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer=resp.getWriter();
		resp.setContentType("text/html");
		
		Date date=new Date();
		 writer.println("<html>");
	        writer.println("<body>");
	        writer.println("<h1><a href='/your-context-path/datetime'>Date and time is: " + date + "</a></h1>");
	        writer.println("</body>");
	        writer.println("</html>");
		writer.close();
		
		
	
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
