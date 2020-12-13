package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.KandaDao;
import dto.Contact;

public class ContactServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		commonProcess(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		commonProcess(request, response);
	}

	public void commonProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		KandaDao dao = new KandaDao();

		Contact contact = new Contact();

		String User_email = request.getParameter("email");
		String User_name = request.getParameter("name");
		String User_age = request.getParameter("age");
		String User_gender = request.getParameter("gender");
		String User_address = request.getParameter("address");
		String Kind = request.getParameter("kind");
		String Contents = request.getParameter("contents");

		contact.setUser_email(User_email);
		contact.setUser_name(User_name);
		contact.setUser_age(Integer.parseInt(User_age));
		contact.setUser_gender(User_gender);
		contact.setUser_address(User_address);
		contact.setKind(Kind);
		contact.setContents(Contents);

		int row = dao.ContactWrite(contact);

		if(row == 1){
		RequestDispatcher dispatcher = request.getRequestDispatcher("view/writeok.jsp");
		dispatcher.forward(request, response);

		}else {

		RequestDispatcher dispatcher = request.getRequestDispatcher("view/writefail.jsp");
		dispatcher.forward(request, response);

		}


	}
}
