package chap18.sec04.exam02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) {
		try {
			Reader reader = null;
			reader = new FileReader("C:/Temp/test.txt");
			//텍스트 파일로부터 문자를 입력하는 문자 입력 스트림 생성
			
			while(true) {
				int data = reader.read();
				if(data==-1)break;
				System.out.print((char)data+",");
			}
			reader.close();
			System.out.println();
			System.out.println("------------------");
			
			reader = new FileReader("C:/Temp/test.txt");
			char[] data = new char[100];
			
			while(true) {
				int num = reader.read(data);
				if(num==-1)break;
				for(int i=0;i<num;i++) {
					System.out.print(data[i]+",");
				}
			}
			reader.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}


	}

}
