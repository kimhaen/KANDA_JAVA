package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import dto.Employee;

public class DeleteServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//DAOのオブジェクト作成
		EmployeeDao empDao = new EmployeeDao();

		//DTO宣言
		Employee emp = new Employee();

		String id = request.getParameter("id");

		//DAO実行
		empDao.delete(id);

		// 従業員一覧表示JSPにフォワード
		request.getRequestDispatcher("/list").forward(request, response);
	}

}
