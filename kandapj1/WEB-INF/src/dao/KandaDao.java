package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dto.Contact;

public class KandaDao {

	// 接続用の情報をフィールドに定数として定義
	private static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost/testdb";
	private static String USER = "root";
	private static String PASS = "root123";

	// データベース接続を行うメソッド
	public static Connection getConnection() {

		try {
			Class.forName(RDB_DRIVE);
			Connection con = DriverManager.getConnection(URL, USER, PASS);

			return con;

		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}

	public int managerLogin(String manager_id, String manager_pw) {

		Connection con = null;
		PreparedStatement smt = null;
		int flag = -1;

		ResultSet rs = null;
		String sql = "SELECT * FROM ManagerInfo where manager_id=?";

		try {

			con = getConnection();
			smt = con.prepareStatement(sql);
			smt.setString(1, manager_id);
			rs = smt.executeQuery();

			if (rs.next()) {

				if (rs.getString("manager_pw").equals(manager_pw)) {
					flag = 1;

				} else {

					flag = 0;
				}

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
		return flag;

	}

	public int ContactWrite(Contact contact) {

		Connection con = null;
		PreparedStatement smt = null;
		int row = 0;

		String sql = "INSERT INTO Contact(user_email,user_name,user_age,user_gender,user_address,kind,contents) VALUES (?,?,?,?,?,?,?)";

		try {

			con = getConnection();
			smt = con.prepareStatement(sql);

			smt.setString(1, contact.getUser_email());
			smt.setString(2, contact.getUser_name());
			smt.setInt(3, contact.getUser_age());
			smt.setString(4, contact.getUser_gender());
			smt.setString(5, contact.getUser_address());
			smt.setString(6, contact.getKind());
			smt.setString(7, contact.getContents());
			row = smt.executeUpdate();

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
		return row;

	}

	public ArrayList<Contact> selectAll() {

		Connection con = null;
		Statement smt = null;

		ArrayList<Contact> list = new ArrayList<Contact>();

		String sql = "SELECT * FROM Contact";

		try {
			con = getConnection();
			smt = con.createStatement();

			// SQL文を発行
			ResultSet rs = smt.executeQuery(sql);

			// 検索結果を配列に格納
			while (rs.next()) {
				// DTOオブジェクトの宣言
				Contact contact = new Contact();

				contact.setNum(rs.getInt("num"));
				contact.setUser_email(rs.getString("user_email"));
				contact.setUser_name(rs.getString("user_name"));
				contact.setKind(rs.getString("kind"));
				contact.setIndate(rs.getString("indate"));
				contact.setContents(rs.getString("contents"));
				contact.setStatus(rs.getInt("status"));

				list.add(contact);

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
		// 検索結果を戻り値で渡す
		return list;
	}

	public Contact ContactRe(int num) {

		Connection con = null;
		PreparedStatement smt = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM Contact WHERE num=?";
		Contact contact = null;

		try {
			con = getConnection();
			smt = con.prepareStatement(sql);
			smt.setInt(1, num);
			rs = smt.executeQuery();
			while (rs.next()) {
				contact = new Contact();
				contact.setUser_email(rs.getString("user_email"));
				contact.setContents(rs.getString("contents"));

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
		return contact;
	}

	public int StatusModify(String user_email) {

		Connection con = null;
		PreparedStatement smt = null;
		ResultSet rs = null;

		String sql = "UPDATE Contact Set Status=1 WHERE user_email='" + user_email + "'";
		int row = 0;

		try {
			con = getConnection();
			smt = con.prepareStatement(sql);

			row = smt.executeUpdate();

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
		return row;
	}
}
