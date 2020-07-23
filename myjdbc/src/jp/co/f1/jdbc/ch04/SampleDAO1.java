package jp.co.f1.jdbc.ch04;

import java.sql.*;
import java.util.ArrayList;

public class SampleDAO1 {

	public static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	public static String URL = "jdbc:mysql://localhost/mybookdb";
	public static String USER = "bms";
	public static String PASSWD = "bms123";

	private static Connection getConnetciont() {
		try {
			Class.forName(RDB_DRIVE);
			Connection con = DriverManager.getConnection(URL, USER, PASSWD);
			return con;

		} catch (Exception e) {
			throw new IllegalStateException(e);
		}

	}

	public ArrayList<String> selectIsbnAll() {

		Connection con = null;
		Statement smt = null;

		ArrayList<String> list = new ArrayList<String>();

		String sql = "SELECT isbn FROM bookinfo ORDER BY isbn";

		try {

			con = SampleDAO1.getConnetciont();
			smt = con.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				list.add(rs.getString("isbn"));
			}

		} catch (SQLException e) {
			System.out.println("Errorが発生しました！\n" + e);
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
		return list;

	}

	public ArrayList<String> selectTitleAll() {

		Connection con = null;
		Statement smt = null;

		ArrayList<String> list = new ArrayList<String>();

		String sql = "SELECT title FROM bookinfo ORDER BY isbn";

		try {

			con = SampleDAO1.getConnetciont();
			smt = con.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				list.add(rs.getString("title"));

			}
		} catch (SQLException e) {
			System.out.println("Errorが発生しました！\n" + e);
			System.out.println("title error");
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
		return list;

	}

	public ArrayList<Integer> selectPriceAll() {

		Connection con = null;
		Statement smt = null;

		ArrayList<Integer> list = new ArrayList<Integer>();

		String sql = "SELECT price FROM bookinfo ORDER BY isbn";

		try {

			con = SampleDAO1.getConnetciont();
			smt = con.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				list.add(rs.getInt("price"));
			}

		} catch (SQLException e) {
			System.out.println("Errorが発生しました！" + e);

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
		return list;
	}

	public int insertBook(String isbn, String title, int price) {

		Connection con = null;
		Statement smt = null;

		int rowsCount = 0;

		String sql = "INSERT INTO bookinfo(isbn,title,price) VALUES('" + isbn + "','" + title + "'," + price + ")";

		try {

			con = SampleDAO1.getConnetciont();
			smt = con.createStatement();

			rowsCount = smt.executeUpdate(sql);

		} catch (SQLException e) {
			System.out.println("Errorが発生しました！\n" + e + "\n");
			System.out.println("insert error");
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
		return rowsCount;
	}

	public static void main(String[] args) {

	}

}
