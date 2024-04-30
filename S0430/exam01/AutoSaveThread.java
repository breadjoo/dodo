package S0430.exam01;

public class AutoSaveThread extends Thread{
	public void save() {
		System.out.println("작업내용 저장");
	}
	
	public void run() {
		while(true) { 
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				break;
			}
			save();
	}

	}
}
