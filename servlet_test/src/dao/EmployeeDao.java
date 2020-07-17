package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.ResultSet;

import dto.Employee;

public class EmployeeDao {
	
	private static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost/textdb";
	private static String USER = "root";
	private static String PASS ="root123";
	
	public static Connection getConnection() {
		
		try {
			Class.forName(RDB_DRIVE);
			Connection con = DriverManager.getConnection(URL,USER,PASS);
			
			
			return con;
			
		} catch(Exception e) {
			
			throw new IllegalStateException(e);
		}
		
		
	}
	
	public ArrayList<Employee> selectAll(){
		
		Connection con = null;
		Statement smt = null;
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		String sql = "SELECT * FROM employeeinfo";
		
		try {
			
			con = getConnection();
			smt = con.createStatement();
			
			ResultSet rs = smt.executeQuery(sql);
			
			while(rs.next()) {
				
				Employee emp = new Employee();
				emp.setId(rs.getString("id"));
				emp.setName(rs.getString("name"));
				emp.setAge(rs.getInt("age"));
				emp.setStore(rs.getString("store"));
				
				list.add(emp);
				
			}
		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			if (smt != null) {
				try {smt.close();}catch(SQLException ignore){}
			}
			if (con != null) {
				try {con.close();}catch(SQLException ignore){}
			}
		}

		return list;
	}
}
