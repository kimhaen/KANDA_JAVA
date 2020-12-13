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

public class ReplyOkServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		commonProcess(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		commonProcess(request, response);
	}

	public void commonProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		KandaDao dao = new KandaDao();

		String user_email = request.getParameter("user_email");
		int row = dao.StatusModify(user_email);

		if( row == 1) {
		RequestDispatcher dispatcher = request.getRequestDispatcher("view/replyok.jsp");
		dispatcher.forward(request, response);
	}else {
		RequestDispatcher dispatcher = request.getRequestDispatcher("view/replyfail.jsp");
		dispatcher.forward(request, response);

	}
	}
}