package chap20.sec06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertExample {

	public static void main(String[] args) {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/thisisjava","root","1234");
			
			String sql = "insert into users (userid, username, userpassword, userage, useremail)"
					+"values (?, ?, ?, ?, ?)";
			
			PreparedStatement pstmt = null;
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, "winter");
			pstmt.setString(2, "한겨울");
			pstmt.setString(3, "12345");
			pstmt.setInt(4, 27);
			pstmt.setString(5, "summer@naver.com");
			
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행수 : " +rows);
			
			pstmt.close();
			
		} catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(connection!=null)
				try {
					connection.close();
					System.out.println("연결 끊김");
					} catch(SQLException e) {
						
			}
		}


	}

}
