package chap07.exam02;

public class TireExample {

	public static void main(String[] args) {
		Tire tire = new Tire() ;
		SnowTire st = new SnowTire();
		Tire tire2 = st;
		tire.run();
		st.run();
		tire2.run();
		
		

	}

}
