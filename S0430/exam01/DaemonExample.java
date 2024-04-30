package S0430.exam01;

public class DaemonExample {

	public static void main(String[] args) {
		AutoSaveThread ast = new AutoSaveThread();
		ast.setDaemon(true);
		ast.start();
		
		try {
			Thread.sleep(4500);
		}catch(InterruptedException e) {}
		System.out.println("메인 스레드 종료 ");

	}

}
