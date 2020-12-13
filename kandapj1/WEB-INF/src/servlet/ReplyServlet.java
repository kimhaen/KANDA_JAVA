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

public class ReplyServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		commonProcess(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		commonProcess(request, response);
	}

	public void commonProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		KandaDao dao = new KandaDao();
		int num = Integer.parseInt(request.getParameter("num"));
		System.out.println(num);
		Contact contact = dao.ContactRe(num);

		request.setAttribute("contact", contact);

		RequestDispatcher dispatcher = request.getRequestDispatcher("view/reply.jsp");
		dispatcher.forward(request, response);
	}
}