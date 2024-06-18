package chap20.sec10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionExample {
	public static void main(String [] args) {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "root", "1234") ;
			
			connection.setAutoCommit(false);
			
			String sql = "update accounts set balance = balance + ? where owner = ? ";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1,50000);
			pstmt.setString(2, "한여름");
			int rows = pstmt.executeUpdate();
			if(rows == 0) throw new Exception("출금 실패");		
			pstmt.close();
			
			String sql2 = "update accounts set balance = balance - ? where owner = ? ";
			PreparedStatement pstmt2 = connection.prepareStatement(sql2);
			pstmt2.setInt(1, 50000);
			pstmt2.setString(2, "한가을");
			int rows2 = pstmt2.executeUpdate();
			if(rows2==0) throw new Exception("입금 실패");
			pstmt2.close();
			
			connection.commit();
			System.out.println("계좌 이체 성공");
		} catch(Exception e) {
			try {
				e.printStackTrace();
				connection.rollback(); // 실패처리
				//connection.setAutoCommit(true); finally 로 결국에 가기 때문에 생략해도 된다.
			} catch(SQLException e2) {
				System.out.println("계좌이체 실패");
				e2.printStackTrace();
		} finally {
			if(connection!=null) {
				try {
					connection.setAutoCommit(true);
					connection.close();
				} catch (SQLException e3) {
					e3.printStackTrace();
				}
			}
		}
	}

	}
}

