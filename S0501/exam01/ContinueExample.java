package S0501.exam01;

public class ContinueExample {
	public static void main (String [] args) {
		for(int i=0;i<10;i++) {
			if(i%2 !=1) {
				continue;
			}System.out.println(i + " ");
		}
	}
}
