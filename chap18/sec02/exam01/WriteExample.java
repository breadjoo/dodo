package chap18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream("C:/temp/test1.db");
			//데이터 도착지를 test1.db 파일로 하는 byte 출력 스트림 생성
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os.write(a);
			os.write(b);
			os.write(c);
			os.flush(); //내부버퍼에 잔류하는 바이트를 모두 출력하고 버퍼를 비움
			os.close(); // 
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
