package org.jsp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InresrRecord {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307?user=root&password=Admin@123");
			System.out.println("connection established");
			stmt = con.prepareStatement("insert into btm.student values(3,'Harry',60);");
			int row = stmt.executeUpdate();
			if(row>0) {
				System.out.println("Record inserted");
			}else {
				System.out.println("not inserted");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

				if (con != null) {
					try {
						con.close();

					} catch (SQLException e) {
						e.printStackTrace();
					}

				}

			}
		}
	}
}
