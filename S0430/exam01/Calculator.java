package S0430.exam01;

public class Calculator {
	private int memory;
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
		this.memory=memory;
	
	try {
		Thread.sleep(50);
		}catch(InterruptedException e) {}
	System.out.println(Thread.currentThread().getName()+":"+this.memory);
	} 
	
	public void setMemory2(int memory) {
		synchronized(this) {
		this.memory=memory;
		
	try {
		Thread.sleep(100);
		} catch(InterruptedException e) {}
	System.out.println(Thread.currentThread().getName()+":"+this.memory);
	}
	}

}
