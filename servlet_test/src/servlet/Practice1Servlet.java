package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Practice1Servlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		commonProcess(request, response);
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		commonProcess(request, response);
		
	}
	
	
	public void commonProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cmd = request.getParameter("cmd");
		
		String msg = "";
		
		if(cmd.equals("get")) {
			
			msg = "";
			
		}else if(cmd.equals("post")) {
			
			msg = "";
			
			
		}else {
			
			msg = "";
		}
		
		request.setAttribute("msg", msg);
		
		request.getRequestDispatcher("/view/result1.jsp").forward(request, response);
		
	}
	
	
	

}
