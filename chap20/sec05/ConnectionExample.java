package chap20.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {

	public static void main(String[] args) {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/thisisjava","root","1234");
			System.out.println("연결 성공");
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
