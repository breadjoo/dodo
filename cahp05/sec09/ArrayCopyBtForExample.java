package cahp05.sec09;

public class ArrayCopyBtForExample {

	public static void main(String[] args) {
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		for(int i=0; i<oldIntArray.length;i++) {
			newIntArray[i] = oldIntArray[i]; // NIA[0] = OIA[0],NIA[1] = OIA[1],NIA[2] = OIA[2] 방식
			
		}
		for (int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i]+"   ");
		}

	}

}
