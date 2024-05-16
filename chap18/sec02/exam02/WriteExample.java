package chap18.sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {

		try{
			OutputStream os = new FileOutputStream("C:/Temp/test2.db");
			
			byte [] arr = {10,20,30};
			
			os.write(arr);
			
			os.flush(); //세트메뉴 ~
			os.close();
		}catch(IOException e) {
			e.printStackTrace();
			
		}
	}

}
