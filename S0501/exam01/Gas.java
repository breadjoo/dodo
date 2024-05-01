package S0501.exam01;

public class Gas {
	private int gas = 0;
	public void setGas(int gas) {
		this.gas = gas;
	}
	
	public boolean isLeftGas() {
		if(gas==0) {
			System.out.println("남은 Gas가 없어 달릴 수 없습니다.");
			return false;
		} else {
			System.out.println("달릴 준비 돼있습니다.");
			return true;
		}
	}
	
	public void run() {
		while(true) {
			if(gas>0) {
				gas -=1;
				System.out.println("달리는 중, 잔량 gas : " + gas);
			} else {
				System.out.println("가스 소진, 충전해야 합니다. 잔량 gas : " + gas);
				return;
			}
		}
	}
	

}
