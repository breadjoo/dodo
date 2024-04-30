package S0430.exam01;

public class YieldExample {

	public static void main(String[] args) {
		WorkThread workThreadA = new WorkThread("A") ;
		WorkThread workThreadB = new WorkThread("B") ;
		
		workThreadA.start();
		workThreadB.start();
		
		try {Thread.sleep(3000);} catch(InterruptedException e) {} // 어떤 경우에 Interrupted를 쓰는지가 좀 궁금.
		workThreadA.work=false;
		try {Thread.sleep(5555);} catch(InterruptedException e) {}
		workThreadB.work=false;

	}

}
/*Thread를 쓸 떄는 extends 가 돼 있는지 확인하고, 실행은 항상 변수.start(); 잊지말기.
 */ 
