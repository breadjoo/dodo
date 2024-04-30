package chap14.sec08;

public class DaemonExample {

	public static void main(String[] args) {

			AutoSaveThread autoSaveThread = new AutoSaveThread();
			autoSaveThread.setDaemon(true);
			//AutoSaveThread()를 데몬 스레드로 만듦
			autoSaveThread.start();
			
			try {
				Thread.sleep(3000); // 3초 일시 정지
			} catch(InterruptedException e) {}
			/*메인 스레드가 3초후 종료되면 데몬 스레드인 AutoSaveThread도 자동 종료됨.
			 * 
			 */
			System.out.println("메인 스레드 종료!");
	}

}
