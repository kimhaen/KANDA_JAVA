package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import dto.Employee;

public class InsertServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//DAOのオブジェクト作成
		EmployeeDao empDao = new EmployeeDao();

		//DTO宣言
		Employee emp = new Employee();

		//エンコーディング
		request.setCharacterEncoding("UTF-8");

		// 取得したデータをDTOに登録
		emp.setId((String) request.getParameter("id"));
		emp.setName((String) request.getParameter("name"));
		emp.setAge(Integer.parseInt(request.getParameter("age")));
		emp.setStore((String) request.getParameter("store"));

		//DAO実行
		empDao.insert(emp);

		// 従業員一覧表示JSPにフォワード
		request.getRequestDispatcher("/list").forward(request, response);
	}

}
