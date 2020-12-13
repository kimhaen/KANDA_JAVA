package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.KandaDao;
import dto.Contact;

public class ListServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		commonProcess(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		commonProcess(request, response);
	}

	public void commonProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		ArrayList<Contact> list = new ArrayList<Contact>();
		KandaDao dao = new KandaDao();


			list = dao.selectAll();
			request.setAttribute("list", list);
			RequestDispatcher dispatcher = request.getRequestDispatcher("view/list.jsp");
			dispatcher.forward(request, response);


	}
}
