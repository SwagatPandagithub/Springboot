package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/WishServlet")
public class WishServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		LocalDateTime dt = LocalDateTime.now();
		
		int hour = dt.getHour();
		
		pw.println("<h1 style='color:red;text-align:center;'>Todays date and time is </h1>");
		if(hour<12) 
			pw.println("<h1 style='color:blue;text-align:center;'>Good Morning</h1>");
		else if(hour<16)
			pw.println("<h1 style='color:blue;text-align:center;'>Good Morning</h1>");
		else if(hour<20)
			pw.println("<h1 style='color:blue;text-align:center;'>Good Evening</h1>");
		else
			pw.println("<h1 style='color:blue;text-align:center;'>Good Night</h1>");
		
		
		pw.close();
		
	}

}
