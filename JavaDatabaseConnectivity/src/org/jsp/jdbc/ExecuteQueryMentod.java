package org.jsp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

public class ExecuteQueryMentod {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307?user=root&password=Admin@123");
			System.out.println("connection established");
//			stmt = con.createStatement();
			pstmt = con.prepareStatement("select * from btm.student;");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int sid = rs.getInt("id");
				String sname = rs.getString("names");
				double smarks = rs.getDouble("marks");
				System.out.println(sid + "\t" + sname + "\t" + smarks);
			}
			System.out.println("Record inserted");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs!=null) {
				try {
					rs.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();

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
