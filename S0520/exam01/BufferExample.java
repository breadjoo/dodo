package S0520.exam01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferExample {

	public static void main(String[] args) throws Exception {

		String ogFilePath1 = BufferExample.class.getResource("originalFile1.jpg").getPath();
		String tgFilePath1 = "C:/Temp/targetFile1.jpg";
		
		FileInputStream fis = new FileInputStream(ogFilePath1);
		FileOutputStream fos = new FileOutputStream(tgFilePath1);
		
		String ogFilePath2 = BufferExample.class.getResource("originalFile2.jpg").getPath();
		//해당 클래스의 폴더 안에 파일로부터 getResource,getPath
		String tgFilePath2 = "C:/Temp/targetFile2.jpg";
		// 타겟파일. -> 복사하는건가 
		FileInputStream fis2 = new FileInputStream(ogFilePath2);
		FileOutputStream fos2 = new FileOutputStream(tgFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		long nonBfTime = copy(fis, fos);
		System.out.println(nonBfTime);
		
		long bfTime = copy(bis, bos);
		System.out.println(bfTime);
		fis.close();
		fos.close();
		bis.close();
		bos.close();
		
	}
	
	public static long copy(InputStream is,OutputStream os) throws Exception {
		
		long start = System.nanoTime();
		while(true) {
			int data = is.read();
			if( data == -1) break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		return end-start ;
	}

}
