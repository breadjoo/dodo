package chap18.sec02.exam03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		// 
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test3.db");
			
			byte [] arr = {10,20,30,40,50,60,70};
			
			os.write(arr,1,3); //1번 인덱스부터 3개 까지만 출력
			
			os.flush();
			os.close();
		}catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
