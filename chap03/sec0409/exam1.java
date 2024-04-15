package chap03.sec0409;

public class exam1 {

	public static void main(String[] args) {
		int score = 88;
				String grade = (score<90 )? "A등급입니다.":"B등급입니다.";
		System.out.println(grade);
		
		int a = 7421107;
		byte b = (byte)(a>>>24);
		int ab = b & 0xff;
			System.out.println(ab);
			
		byte c = (byte)(a>>>16);
		int ac = c & 0xff;
			System.out.println(ac);
		
		byte d = (byte)(a>>>8);
		int ad = d & 255;
			System.out.println(ad);
			
		byte e = (byte)(a);
		int ae = e & 0xff;
			System.out.println(ae);
			
			
		int change = 87;
			for (int i=1;i<6;i++) {
			change++;
			}
				System.out.println(change);
			
		

	}

}
