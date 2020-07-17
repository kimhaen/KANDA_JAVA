package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dto.Employee;

public class EmployeeDao {

	private static final String RDB_DRIVE = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost/testdb";
	private static final String USER = "root";
	private static final String PASSWD = "root123";

	//DB連結メソッド
	public static Connection getConnection() {

		try {
			Class.forName(RDB_DRIVE);
			Connection con = DriverManager.getConnection(URL, USER, PASSWD);

			return con;

		} catch (Exception e) {

			throw new IllegalStateException(e);
		}

	}
	//LISTメソッド
	public ArrayList<Employee> selectAll() {

		Connection con = null;
		Statement smt = null;

		String sql = "SELECT * FROM employeeinfo";

		ArrayList<Employee> list = new ArrayList<Employee>();

		try {

			con = getConnection();
			smt = con.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {

				Employee emp = new Employee();
				emp.setId(rs.getString("id"));
				emp.setName(rs.getString("name"));
				emp.setAge(rs.getInt("age"));
				emp.setStore(rs.getString("store"));

				list.add(emp);
			}

		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			try {
				// コネクションとステートメントのクローズ
				if (smt != null) {
					smt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
			}
		}

		return list;
	}
	//登録メソッド
	public void insert(Employee emp) {

		Connection con = null;
		Statement smt = null;

		String sql = "INSERT INTO employeeinfo(id, name, age, store) VALUES ('" + emp.getId() + "','" + emp.getName()
				+ "'," + emp.getAge() + ",'" + emp.getStore() + "')"; // 全情報取得SQL

		try {

			con = getConnection();
			smt = con.createStatement();
			smt.executeUpdate(sql);

		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			if (smt != null) {
				try {
					smt.close();
				} catch (SQLException ignore) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ignore) {
				}
			}
		}
	}

	//削除メソッド
	public void delete(String id) {

		Connection con = null;
		Statement smt = null;

		String sql = "DELETE FROM employeeinfo WHERE id ='" + id + "'";

		try {

			con = getConnection();
			smt = con.createStatement();

			smt.executeUpdate(sql);

		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			if (smt != null) {
				try {
					smt.close();
				} catch (SQLException ignore) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ignore) {
				}
			}
		}
	}

	//検索メソッド
	public Employee search(String id) {

		Connection con = null;
		Statement smt = null;

		String sql = "SELECT * FROM employeeinfo WHERE id = '" + id + "'";
		Employee emp = new Employee();

		try {

			con = getConnection();
			smt = con.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {

				emp.setId(rs.getString("id"));
				emp.setName(rs.getString("name"));
				emp.setAge(rs.getInt("age"));
				emp.setStore(rs.getString("store"));

			}

		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			if (smt != null) {
				try {
					smt.close();
				} catch (SQLException ignore) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ignore) {
				}
			}

		}
		return emp;
	}

}
