package chap14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {
	//멀티 스레드 

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override // 작업 스레드가 실행할 코드부분.
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++) {
					toolkit.beep(); // 비프음 발생
					System.out.println("띵");
					try {Thread.sleep(500);} catch (Exception e) {}
				}
			}
		});
		
		thread.start(); //생성된 작업 스레드의  run()메소드를 실행
		
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try{Thread.sleep(700);} catch(Exception e) {}
		}

	}

}

      