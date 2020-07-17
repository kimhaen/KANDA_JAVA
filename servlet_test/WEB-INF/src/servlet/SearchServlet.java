package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import dao.EmployeeDao;
import dto.Employee;

public class SearchServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		EmployeeDao empDao = new EmployeeDao();

		String id = request.getParameter("id");

		Employee emp = empDao.search(id);


		request.setAttribute("emp", emp);


		request.getRequestDispatcher("/view/search.jsp").forward(request, response);
	}

}
