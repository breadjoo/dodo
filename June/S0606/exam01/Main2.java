package June.S0606.exam01;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		String[] croatianA = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(String croatian : croatianA) {
			if(a.contains(croatian)) {
				a = a.replace(croatian, "0");
			}
		}
		System.out.println(a.length());

	}

}
