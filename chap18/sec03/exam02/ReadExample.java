package chap18.sec03.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/test2.db");
			
			byte [] data = new byte[100];
			
			while(true) {
				int number = is.read(data);
				System.out.println("num : "+number);//읽은 byte의 수 
				// 최대 100byte를 읽고 읽은 바이트는 data 저장, 읽은 수는 리턴
				if(number==-1) break;
				
				for(int i =0;i<number;i++) {
					System.out.println(data[i]);
				}
			}
			is.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
