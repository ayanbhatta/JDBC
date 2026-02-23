package org.jsp.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class  UsingRecordInsert {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3307?user=root&password=Admin@123");
			pstmt=con.prepareStatement("insert into btm.user values(?,?,?,?)");
			
			pstmt.setInt(1,3);
			pstmt.setString(2, "Vasant");
			pstmt.setString(3,"vasant");
			pstmt.setString(4,"vasant@1345");
			pstmt.executeUpdate();
			System.out.println("Record inserted");
			
			pstmt.setInt(1,4);
			pstmt.setString(2, "Ayush");
			pstmt.setString(3, "ayush");
			pstmt.setString(4,"ayush@123");
			pstmt.executeUpdate();
			
			
			pstmt.setInt(1, 5);
			pstmt.setString(2, "Arjun");
			pstmt.setString(3,"arjun");
			pstmt.setString(4,"arjun@1345");
			pstmt.executeUpdate();
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				}
				catch(SQLException e){
					e.printStackTrace();
				}
			}
			
			if(con!=null) {
				try {
					con.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

