package S0429.exam01;

import java.awt.Toolkit;

public class BeepPrintExam1 {

	public static void main(String[] args) {
		Thread thread = new Thread() {
			public void run() {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i=0;i<5;i++) {
				toolkit.beep();
				try{Thread.sleep(500);} catch (Exception e) {}
			}
		}
		};	
	}

}
