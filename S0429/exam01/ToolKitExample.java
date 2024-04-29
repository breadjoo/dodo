package S0429.exam01;

import java.awt.Toolkit;

public class ToolKitExample {
	public static void main (String[]args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for ( int i =0;i<5;i++) {
			toolkit.beep();
			try {Thread.sleep(1000); } catch (Exception e) {}
		}
		
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
		
	}
}
