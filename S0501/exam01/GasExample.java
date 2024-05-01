package S0501.exam01;

public class GasExample {
	public static void main (String [] args) {
		
		Gas gas = new Gas();

		gas.setGas(6);
		gas.isLeftGas(); {
			System.out.println("출발!");
		}
		
		
		gas.run(); {
			System.out.println("끋");
		}
		
	}

}
