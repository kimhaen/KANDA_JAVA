package jp.co.f1.jdbc.ch03;

import java.sql.*;

public class SampleNotTransaction {

	public static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	public static String URL = "jdbc:mysql://localhost/mybookdb";
	public static String USER = "bms";
	public static String PASSWD = "bms123";

	public static void main(String[] args) {

		String sql = null;
		int num = 0;

		Connection con = null;
		Statement smt = null;

		try {
			Class.forName(RDB_DRIVE);
			con = DriverManager.getConnection(URL, USER, PASSWD);

			smt = con.createStatement();

			System.out.println("■登録SQL発行前の書籍一覧表示");
			selectAll();

			sql = "INSERT INTO bookinfo (isbn,title,price) VALUES ('00006','object-C入門テキスト',3500)";
			num = smt.executeUpdate(sql);
			System.out.println("\nSQL発行1回目：" + num + "件の新規レコードを登録しました。");

			sql = "INSERT INTO bookinfo (isbn,title,price) VALUES ('00007','C++入門テキスト',3000)";
			num = smt.executeUpdate(sql);
			System.out.println("\nSQL発行2回目：" + num + "件の新規レコードを登録しました。");

			System.out.println("■登録SQL発行後の書籍一覧表示");
			selectAll();


		} catch (Exception e) {
			try {
				if (smt != null) {
					smt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException ignore) {

			}
		}
	}

	private static void selectAll() {

		Connection con = null;
		Statement smt = null;

		try {
			Class.forName(RDB_DRIVE);
			con = DriverManager.getConnection(URL, USER, PASSWD);

			smt = con.createStatement();

			String sql = "SELECT * FROM bookinfo ";

			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				System.out.println("isbn →" + rs.getString("isbn") + "title →" + rs.getString("title") + "price→"
						+ rs.getString("price"));
			}

		} catch (Exception e) {
			System.out.println("JDBCデータベース連続エラー");

		} finally {
			try {

				if (smt != null) {
					System.out.println("SQLステートメントうぃクローズしました。");
					smt.close();
				}
				if (con != null) {
					System.out.println("DB連続クローズしました。");
					con.close();
				}
			} catch (SQLException ignore) {

			}

		}

	}

}
