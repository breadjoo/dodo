package S0501.exam01;

public class Sum {
	int sum(int ... value) {
		int sum = 0;
		for (int i =0; i<value.length;i++) {
			sum += value[i];
		} return sum;
		
	}
}