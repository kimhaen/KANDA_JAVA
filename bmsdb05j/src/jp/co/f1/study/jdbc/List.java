package jp.co.f1.study.jdbc;

import java.sql.*;

public class List {

	public static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	public static String URL = "jdbc:mysql://localhost/mybookdb";
	public static String USER = "root";
	public static String PASSWD = "root123";

	public static void main(String[] args) {
		try {
			Class.forName(RDB_DRIVE);
			Connection con = DriverManager.getConnection(URL, USER, PASSWD);
			Statement smt = con.createStatement();
			String sql = "SELECT * FROM bookinfo ";
			ResultSet rs = smt.executeQuery(sql);
			System.out.println("isbn \t 書籍名 \t 価格 ");

			while (rs.next()) {

				System.out.println(rs.getString("isbn")+ "\t"+  rs.getString("title")+ "\t"+rs.getString("price"));

			}

			smt.close();
			con.close();

		} catch (Exception e) {
			System.out.println("JDBCデータベース連続エラー");
		}

	}

}
