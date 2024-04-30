package S0430.exam02;

public class PrintThread extends Thread{
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run () {
		while(!stop) {
			System.out.println("실행중");
		}
		System.out.println("리소스 정리");
		System.out.println("종료");
	}

}
