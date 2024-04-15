package cahp05.sec06;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		//배열 변수 선언과 배열 생성
		
		int[] arr1 = new int[3];
		
		//배열 항목의 초기값 출력
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+", " );
		}
			System.out.println();
		//배열 항목의 값을 변경HaeBoJa
		arr1[0] = 10;
		arr1[1] = -2;
		arr1[2] = 23;
		//배열 항목의 변경 값 출력
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+", " );
		}
			System.out.println("\n");
		
		double[] arr2 = new double[3];
		for (int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+", ");
		}	
		//배열 항목의 값 변경
		arr2[0]=1.0;
		arr2[1]=5412.3;
		arr2[2]=0.112341;
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+", ");
			System.out.println("\n");
		}
		String[] arr3 = new String[3];
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr3[i]+", ");
		}	System.out.println();
		arr3[0]="4월";
		arr3[1]="12일";
		arr3[2]="금요일";
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
	}

}
