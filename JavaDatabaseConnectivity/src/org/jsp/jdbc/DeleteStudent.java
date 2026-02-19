package org.jsp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStudent {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307?user=root&password=Admin@123");
			System.out.println("connection established");
			stmt = con.createStatement();
			stmt.executeUpdate("delete from btm.student where id=2;");
			System.out.println("Record inserted");
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
