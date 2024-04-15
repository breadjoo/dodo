package cahp05.sec03;

public class RefernceVariableCompareExample {

	public static void main(String[] args) {
		int[] arr1; // 배열변수 arr1 선언
		int[] arr2;
		int[] arr3;
		int[] arr4;
		int[] arr5;
		
		arr1 = new int[] {1,2,3}; // 배열 {1,2,3}을 생성하고 arr1 변수에 대입
		arr2 = new int[] {1,2,3}; // 배열 {1,2,3}을 생성하고 arr2 변수에 대입
		arr3 = arr2; // 배열 변수 arr2의 값을 배열 변수 arr3에 대입
		arr4 = new int[] {1,2,3};
		arr5 = new int[] {1,2,3};
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr1 == arr2);
		System.out.println(arr3);
		System.out.println(arr2 == arr3);
		System.out.println(arr4);
		System.out.println(arr5);
		
		
	}

}
