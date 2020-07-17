package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import dto.Employee;

public class ListServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String error = "";
		
		try {
			
			ArrayList<Employee> list = new ArrayList<Employee>();
			
			EmployeeDao objDao = new EmployeeDao();
			
			list = objDao.selectAll();
			
			request.setAttribute("list", list);
									
		} catch(IllegalStateException e) {
			error ="DBエラー";
		} catch(Exception e) {
			error = "エラー発生"+ e;
		}finally {
			request.setAttribute("error", error);
			request.getRequestDispatcher("/view/list.jsp").forward(request, response);
		}
		
	}

}
