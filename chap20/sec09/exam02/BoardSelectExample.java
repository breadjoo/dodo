package chap20.sec09.exam02;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardSelectExample {

	public static void main(String[] args) {
		
		Connection connection = null;
		
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava","root","1234");
			
			PreparedStatement pstmt = null;
			
			String sql = "select * from boards where bno = ? ";
			pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, 1);
			ResultSet rs = null;
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Board board = new Board();
				
				board.setBNo(rs.getInt(1));
				board.setBTitle(rs.getString(2));
				board.setBContent(rs.getString("bcontent"));
				board.setBWriter(rs.getString("bwriter"));
				board.setBDate(rs.getDate("bdate"));
				board.setBFileName(rs.getString("bfileName"));
				board.setBFileDate(rs.getBlob("bfiledate"));
				
				System.out.println(board);
				
				Blob blob = board.getBFileDate();
				if(blob != null) {
					InputStream is = blob.getBinaryStream(); // 저장할 파일설정
					OutputStream os = new FileOutputStream("C:/Temp/"+board.getBFileName()); //저장경로 설정
					is.transferTo(os);// is의 내용을 os로 저장
					os.flush();
					os.close();
					is.close();
				}
				
				
		} rs.close();
		pstmt.close();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
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
