package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import dao.EmployeeDao;
import dto.Employee;

public class ListServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//DAOのオブジェクト作成
		EmployeeDao empDao = new EmployeeDao();

		// 従業員リストの全件取得
		ArrayList<Employee> list =  empDao.selectAll();

		// 取得したリストをリクエストスコープに登録
		request.setAttribute("list", list);

		// 従業員一覧表示JSPにフォワード
		request.getRequestDispatcher("/view/list.jsp").forward(request, response);
	}

}
