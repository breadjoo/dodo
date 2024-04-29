package chap14.sec05.exam03;

public class YieldExample {

	public static void main(String[] args) {
		WorkThread workThreadA = new WorkThread("WorkThreadA");
		WorkThread workThreadB = new WorkThread("WorkThreadB");
		
		workThreadA.start();
		workThreadB.start();
		try {Thread.sleep(4500);
		} catch(InterruptedException e) {}
		workThreadA.work = false;
		try {Thread.sleep(7777);
		} catch(InterruptedException e) {}
		workThreadA.work = true;
	}

}
