package chap14.sec05.exam03;

public class WorkThread extends Thread {
	public boolean work = true;
	
	public WorkThread(String name) {
		setName(name);
	}
	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println(getName() + " : 작업 처리");
			} else {
				Thread.yield();
				/* yield() : 실행되는 스레드는 실행 대기상태로 돌아가고, 다른 스레드가 실행되도록 양보하는 메소드.
				 * 
				 */
		}
	}

}
}
