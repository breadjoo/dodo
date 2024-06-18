package chap20.sec11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

public class BoardExample3 {

	//필드
	private Scanner sc = new Scanner(System.in);
	private Connection connection = null;
	
	//생성자 
	public BoardExample3() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/thisisjava";
			String id = "root";
			String password = "1234";
			connection = DriverManager.getConnection(url,id,password);
		} catch(Exception e) {
			e.printStackTrace();
			exit();
		}
	}
	
	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("=========================================================================");
		System.out.printf("%-6s%-12s%-16s%-40s\n","no","writer","date","title");
		System.out.println("=========================================================================");

		
		// boards테이블에서  게시물 정보를 가져와서 출력하기
		
		try {
			String sql = "select bno, btitle, bcontent, bwriter, bdate from boards order by bno asc";
		
			PreparedStatement pstmt = connection.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Board board = new Board();
				board.setBNo(rs.getInt(1));
				board.setBTitle(rs.getString(2));
				board.setBContent(rs.getString(3));
				board.setBWriter(rs.getString(4));
				board.setBDate(rs.getDate(5));
				System.out.printf("%-6s%-12s%-16s%-40s\n", board.getBNo(),board.getBWriter(),board.getBDate(),board.getBTitle());
				
			}
			rs.close();
			pstmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
			exit();
		}
		
		mainMenu();
	}

	public void mainMenu() {
		System.out.println();
		System.out.println("=================================================================");
		System.out.println(" 메인메뉴 : | 1.Create | 2.Read | 3. Clear | 4. Exit |");
		System.out.print(" 메뉴 선택 : ");
		String menuNo = sc.nextLine(); 
		System.out.println();
		
		switch(menuNo) {
		case "1" -> create();
		case "2" -> read();
		case "3" -> clear();
		case "4" -> exit();
		}
		
		
	}
	public void create() {
		System.out.println("*** create ***");
		Board board = new Board();
		System.out.println("[새 게시물 입력]");
		System.out.print("제목 : ");
		board.setBTitle(sc.nextLine());
		System.out.println("내용 : ");
		board.setBContent(sc.nextLine());
		System.out.println("작성자 : ");
		board.setBWriter(sc.nextLine());
		
		System.out.println("================================================================");
		System.out.println("보조 메뉴 : 1.OK   | 2. Cancel");
		System.out.print("메뉴 선택 : ");
		String menuNo = sc.nextLine();
		if(menuNo.equals("1")) {
			try {
				String sql = "insert into boards (bno,btitle,bcontent,bwriter,bdate) values(null, ?, ?, ?, now())";
				PreparedStatement pstmt = connection.prepareStatement(sql);
				pstmt.setString(1, board.getBTitle());
				pstmt.setString(2, board.getBContent());
				pstmt.setString(3, board.getBWriter());
				pstmt.executeUpdate();
				pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		list();
	}
	
	public void read() {
		System.out.println("*** read ***");
		System.out.println("[게시물 읽기]");
		System.out.print("bno : ");
		int bno = Integer.parseInt(sc.nextLine());
		
		try {
			String sql = "select bno, btitle, bcontent, bwriter, bdate from boards where bno = ?" ;
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, bno);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				Board board = new Board();
				board.setBNo(rs.getInt("bno"));
				board.setBTitle(rs.getString(2));
				board.setBContent(rs.getString(3));
				board.setBWriter(rs.getString(4));
				board.setBDate(rs.getDate("bdate"));
				System.out.println("##############");
				System.out.println("번호 : " + board.getBNo());
				System.out.println("제목 : " + board.getBTitle());
				System.out.println("내용 : " + board.getBContent());
				System.out.println("작성자 : " + board.getBWriter());
				System.out.println("날짜 : " + board.getBDate());
				System.out.println("###############");
				System.out.println("-----------------");
				System.out.println("보조 메뉴 1.update | 2. delete | 3.list");
				System.out.print("메뉴 선택 : ");
				String menuNo = sc.nextLine();
				System.out.println();
				if(menuNo.equals("1")) {
					update(board);
				} else if (menuNo.equals("2")) {
					delete(board);
				}
			}
			
			rs.close();
			pstmt.close();
		}catch (Exception e) {
			e.printStackTrace();
			exit();
		}
		
		list();
	}
	
	public void update(Board board) {
		System.out.println("[수정 내용 입력]");
		
		System.out.println();
		System.out.print("제목 : ");
		board.setBTitle(sc.nextLine());
		System.out.print("내용 : ");
		board.setBContent(sc.nextLine());
		System.out.print("작성자 : ");
		board.setBWriter(sc.nextLine());
		System.out.print("변경할 데이터 bNO : " );
		int bno = Integer.parseInt(sc.nextLine());
		
		System.out.println("----------------------");
		System.out.println("보조 메뉴 : 1.  OK | 2. Canmcel");
		System.out.print("메뉴 선택 : "); 
		String menuNo = sc.nextLine();
		if(menuNo.equals("1")) {
			try {
				String sql = "update boards set btitle = ?, bcontent = ?, bwriter = ?  where bno = ?";
				PreparedStatement pstmt = connection.prepareStatement(sql);
				pstmt.setString(1, board.getBTitle());
				pstmt.setString(2, board.getBContent());
				pstmt.setString(3, board.getBWriter());
				pstmt.setInt(4, bno);
				pstmt.executeUpdate();
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		list();
	}
	public void delete(Board board) {
		System.out.println("[삭제할 데이터 입력]");
		System.out.print("삭제할 데이터 bNo : " );
		board.setBNo(sc.nextInt());
		
		try {
			String sql = "delete from boards where bno = ? ";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, board.getBNo());
			pstmt.executeUpdate();
			pstmt.close();
		} catch(Exception e) {
			e.printStackTrace();
			exit();
		}
		list();
	}
	
	public void clear() {
		System.out.println("*** clear ***");
		System.out.println("[게시물 전체 삭제]");
		System.out.println("---------------------");
		System.out.println("보조 메뉴 : 1.OK | 2.Cancel");
		System.out.print("메뉴 선택 : ");
		String menuNo = sc.nextLine();
		if(menuNo.equals("1")) {
			try {
				String sql = "truncate table boards";
				PreparedStatement pstmt = connection.prepareStatement(sql);
				pstmt.executeUpdate();
				pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		
		list();
	}
	
	public void exit() {
		if(connection!=null) {
			try {
				connection.close();
			} catch(SQLException e) {
				
			}
		}
		System.out.println("**게시판 종료**");
		System.exit(0);
	}
	public static void main(String[] args) {
		
		BoardExample3 boardExample3 = new BoardExample3();
		boardExample3.list();
		

	}

}
