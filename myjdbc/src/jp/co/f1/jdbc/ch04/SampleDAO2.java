package jp.co.f1.jdbc.ch04;

import java.sql.*;
import java.util.ArrayList;

public class SampleDAO2 {

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

	public ArrayList<SampleDTO> selectAll(){

		Connection con = null;
		Statement smt = null;

		ArrayList<SampleDTO> list = new ArrayList<SampleDTO>();
		String sql = "SELECT * FROM bookinfo ORDER BY isbn";

		try {

			con = SampleDAO2.getConnetciont();
			smt = con.createStatement();

			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				SampleDTO objDto = new SampleDTO();
				objDto.setIsbn(rs.getString("isbn"));
				objDto.setTitle(rs.getString("title"));
				objDto.setPrice(rs.getInt("price"));
				list.add(objDto);
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


	public int insertBook(SampleDTO book) {

		Connection con = null;
		Statement smt = null;

		int rowsCount = 0;

		String sql = "INSERT INTO bookinfo(isbn,title,price) VALUES('" + book.getIsbn() + "','" + book.getTitle()+ "'," + book.getPrice() + ")";
		try {

			con = SampleDAO2.getConnetciont();
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
