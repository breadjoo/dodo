package chap20.sec06;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoardInsertExample {

	public static void main(String[] args) {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/thisisjava","root","1234");
			
			String sql = ""+"insert into boards (btitle,bcontent,bwriter,bdate,bfilename,bfiledate)"
					+ "values (?, ?, ?, now(), ?, ?)";
			
			PreparedStatement pstmt = null;
			pstmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, "눈 오는 날");
			pstmt.setString(2, "함박눈이 내려요.");
			pstmt.setString(3, "winter");
			pstmt.setString(4, "snow.jpg");
		pstmt.setString(5, "abc");
//			pstmt.setBlob(5, new FileInputStream("src/chap20/sec06/img2.jpg"));
			
			int row = pstmt.executeUpdate();
			
			
			
			if(row==1) {
				ResultSet rs = pstmt.getGeneratedKeys(); // 입력한 데이터의 primary key 값을 가져옴
				if(rs.next()) {
					int bno = rs.getInt(1);
					System.out.println("저장된 bno : " + bno);
				} rs.close();
			}
			
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
