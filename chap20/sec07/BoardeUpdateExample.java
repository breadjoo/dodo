package chap20.sec07;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardeUpdateExample {

	public static void main(String[] args) {

		Connection connection  = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava","root","1234");
			
			String sql = new StringBuilder()
					.append("update boards set ")
					.append("btitle = ?, ")
					.append("bcontent = ?, ")
					.append("bfilename = ?, ")
					.append("bfiledate = ? ")
					.append("where bno = ? ")
					.toString();
									
			PreparedStatement pstmt = null;
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, "눈사람");
			pstmt.setString(2, "눈으로 만든 사람");
			pstmt.setString(3, "snowman.jpg");
			pstmt.setBlob(4, new FileInputStream("src/chap20/sec07/img.jpg"));
			pstmt.setInt(5, 7);
			
			int rows = pstmt.executeUpdate();
			System.out.println("수정된 행 수 : " + rows);
		} catch(Exception e) {
			e.printStackTrace();
		}
		 finally {
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
