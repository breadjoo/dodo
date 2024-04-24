package S0424.exam01;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String data1 = "1&2&3&4,5,6,7";
		String [] arr = data1.split("&|,");
		for ( String token : arr) {
			System.out.println(token);
		}
		
		
		String data2 = "asdf/as/df/a/sd/f/s/d";
		StringTokenizer st = new StringTokenizer(data2,"/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
				
				
		
			


	}

}
