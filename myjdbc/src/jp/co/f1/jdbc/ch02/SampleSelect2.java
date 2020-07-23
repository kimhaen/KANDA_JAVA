package jp.co.f1.jdbc.ch02;

import java.sql.*;

public class SampleSelect2 {

	public static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	public static String URL = "jdbc:mysql://localhost/mybookdb";
	public static String USER = "bms";
	public static String PASSWD = "bms123";

	public static void main(String[] args) {

		Connection con = null;
		Statement smt = null;

		try {
			Class.forName(RDB_DRIVE);
			con = DriverManager.getConnection(URL, USER, PASSWD);
			smt = con.createStatement();
			String sql = "SELECT * FROM bookinfo ";
			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				System.out.println("isbn →" + rs.getString("isbn") +
						"title →" + rs.getString("title") +
						"price→"+ rs.getString("price"));

			}

		} catch (Exception e) {
			System.out.println("JDBCデータベース連続エラー"+e);
		}finally {
			try {
				if(smt != null) {
					System.out.println("SQLステートメントうぃクローズしました。");
					smt.close();
				}
				if(con != null) {
					System.out.println("DB連続クローズしました。");
					con.close();
				}
			}catch(SQLException ignore) {

			}
		}

	}

}
