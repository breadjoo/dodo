package chap18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {

	public static void main(String[] args) throws Exception{
		
		String originalFileName = "C:/Temp/img4.jpg";
		String targetFileName = "C:/Temp/img3.jpg";
		
		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(targetFileName);
		
		byte[] data = new byte[1024]; // 읽은 바이트를 저장할 배열 생성ㄹ
		while (true) {
			int num = is.read();
			//최대 1024바이트를 읽고 data배열에 저장, 읽은 바이트수는 num에 리턴
			if(num==-1) break; 
			os.write(data,0,num); // 읽은 바이트수만큼 출력
		}
		os.flush();
		os.close();
		is.close();
		
		System.out.println("복사가 잘 되었습니다.");


	}

}
