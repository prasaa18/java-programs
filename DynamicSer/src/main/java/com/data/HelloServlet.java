package com.data;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	

	private ServletResponse responce;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		        String  s = request.getParameter("n");
				PrintWriter out=responce.getWriter();
				System.out.println("<h1>Hello "+s+"</h1>");
				System.out.println(s);
				out.close();
				
						
		
	}

}
