package jp.co.f1.study.jdbc;

import java.sql.*;

public class Update {

		public static String RDB_DRIVE = "com.mysql.jdbc.Driver";
		public static String URL = "jdbc:mysql://localhost/mybookdb";
		public static String USER = "root";
		public static String PASSWD = "root123";

		public static void main(String[] args) {
			try {
				Class.forName(RDB_DRIVE);
				Connection con = DriverManager.getConnection(URL, USER, PASSWD);
				Statement smt = con.createStatement();
				String sql = "UPDATE bookinfo SET title='C' WHERE isbn = '0002' ";
				int rowsCount = smt.executeUpdate(sql);

				System.out.println(rowsCount + "レコード更新しました。");

				smt.close();
				con.close();

			} catch (Exception e) {
				System.out.println("JDBCデータベース連続エラー");
			}

		}

	}
