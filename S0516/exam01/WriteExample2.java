package S0516.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) {

		try {
		OutputStream os = new FileOutputStream("C:/Temp/test12.db");
		
		byte [] arr = {10,20,30,40,50};
		
		os.write(arr);
		
		os.flush();
		os.close();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
