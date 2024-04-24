package chap12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {

		String data1 = "문동은&전재준,박연진&하도영";
		String[] arr = data1.split("&|,");
		for(String token : arr ) {
			System.out.println(token);
		}
		System.out.println("---------");
		
		String data2 = "문동은/전재준/박연진/하도영";
		StringTokenizer st = new StringTokenizer(data2,"/");
		
		while (st.hasMoreTokens()) { // 남아있는 문자열 검사
			String token = st.nextToken(); // 문자열을 하나씩 가져옴
			System.out.println(token);
		}
		

	}

}
