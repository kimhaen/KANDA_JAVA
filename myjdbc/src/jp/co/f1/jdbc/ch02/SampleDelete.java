package jp.co.f1.jdbc.ch02;

import java.sql.*;

public class SampleDelete {

	public static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	public static String URL = "jdbc:mysql://localhost/mybookdb";
	public static String USER = "bms";
	public static String PASSWD = "bms123";

	public static void main(String[] args) {

		try {
			Class.forName(RDB_DRIVE);
			Connection con = DriverManager.getConnection(URL, USER, PASSWD);
			Statement smt = con.createStatement();
			String sql = "DELETE FROM bookinfo WHERE isbn = '00006'";
			//DELETE FROM bookinfo WHERE isbn = '00006' OR isbn = '00007';
			int rowsCount = smt.executeUpdate(sql);
			System.out.println(rowsCount + "レコード削除しました。");

			smt.close();
			con.close();

		} catch (Exception e) {
			System.out.println("JDBCデータベース連続エラー");
		}

	}
}