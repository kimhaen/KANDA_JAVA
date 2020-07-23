package jp.co.f1.jdbc.ch02;

import java.sql.*;

public class SampleSelect {

	public static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	public static String URL = "jdbc:mysql://localhost/mybookdb";
	public static String USER = "bms";
	public static String PASSWD = "bms123";

	public static void main(String[] args) {

		try {
			Class.forName(RDB_DRIVE);
			Connection con = DriverManager.getConnection(URL, USER, PASSWD);
			Statement smt = con.createStatement();
			String sql = "SELECT * FROM bookinfo ";
			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				System.out.println("isbn →" + rs.getString("isbn") + "title →" + rs.getString("title") + "price→"
						+ rs.getString("price"));

			}

			smt.close();
			con.close();

		} catch (Exception e) {
			System.out.println("JDBCデータベース連続エラー");
		}

	}

}
