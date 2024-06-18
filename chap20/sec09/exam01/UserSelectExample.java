package chap20.sec09.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserSelectExample {

	public static void main(String[] args) {
		
		Connection connection = null;
		
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava","root","1234");
			
			PreparedStatement pstmt = null;
			
			String sql = "select * from users where userid = ? ";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, "winter");
			
			ResultSet rs = null;
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				User user = new User();
				user.setUserID(rs.getString("userid"));
				user.setUserName(rs.getString("username"));
				user.setUserPassword(rs.getString(3));
				user.setUserEmail(rs.getString("useremail"));
				user.setUserAge(rs.getInt("userage"));
				System.out.println(user);
			} else {
				System.out.println("사용자 아이디가 존재하지 않음");
			}
			
			pstmt.close();
			rs.close();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
