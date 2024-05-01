package S0501.exam01;

public class Car {
	
	private int speed;
	private boolean stop;
	
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed +=speed;
		} else {
		this.speed += speed;
	}}
	
	public int getSpeed() {
		return speed;
	}

	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop=stop;
		if(stop==true) {
			this.speed=0;
		}
	}
	
}
