package chap12.sec05;

public class BytesToStringExample {

	public static void main(String[] args) {
		// 문자열을 byte 배열로 변환시키고 다시 문자열로 복원
		String data = "자바";
		// String -> byte 배열로 (UTF-87로 인코딩)
		byte [] arr1 = data.getBytes();
		System.out.println("arr1: " + Arrays.toString(arr1));
	}

}
 