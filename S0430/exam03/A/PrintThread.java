package S0430.exam03.A;

public class PrintThread extends Thread{
	public void run() {
		while(true) {
			System.out.println("실행중");
		 if(Thread.interrupted()) {
		break;
		}
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
	

}
