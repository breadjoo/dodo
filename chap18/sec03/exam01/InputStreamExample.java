package chap18.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {

	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream("C:/Temp/test1.db");
			//데이터 출발지를 test1.db로 하는 입력 스트림을 생성
			while(true) {
				int data = is.read(); //1byte씩 읽기
				if(data == -1) break; // 파일 끝에 도달했을 경우
				System.out.println(data);
			}
			is.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		} 
		

	}

}
