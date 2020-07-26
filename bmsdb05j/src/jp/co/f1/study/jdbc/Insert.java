package jp.co.f1.study.jdbc;

import java.sql.*;

public class Insert {

	public static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	public static String URL = "jdbc:mysql://localhost/mybookdb";
	public static String USER = "root";
	public static String PASSWD = "root123";

	public static void main(String[] args) {
		try {
			Class.forName(RDB_DRIVE);
			Connection con = DriverManager.getConnection(URL, USER, PASSWD);
			Statement smt = con.createStatement();
			String sql = "INSERT INTO bookinfo(isbn,title,price) VALUES('00006','Shell',1006)";
			int rowsCount = smt.executeUpdate(sql);

			System.out.println(rowsCount + "レコード登録しました。");

			smt.close();
			con.close();

		} catch (Exception e) {
			System.out.println("JDBCデータベース連続エラー");
		}

	}

}
