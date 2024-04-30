package chap14.sec07.exam02;

public class PrintThread extends Thread{
	public void run() {
		try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1); // 잠시라도 일시 정지를 만듦.
			}
		}catch(InterruptedException e) {}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}

}
