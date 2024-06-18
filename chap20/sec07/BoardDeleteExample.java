package chap20.sec07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDeleteExample {

	public static void main(String[] args) {
		Connection connection = null;
		
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava","root","1234");
			
			PreparedStatement pstmt = null;
			
			String sql = "delete from boards where btitle = ?";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, "여름");
			
			int rows = pstmt.executeUpdate();
			System.out.println("삭제된 행 수 : " + rows);
			
			pstmt.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
