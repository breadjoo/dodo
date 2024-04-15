package cahp05.sec09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java","array","copy","work","space"} ;
		String[] newStrArray = new String[8];
		System.arraycopy(oldStrArray, 0, newStrArray, 2, oldStrArray.length); // System.arraycopy(원본배열,원본배열시작인덱스,복사배열,복사배열시작인덱스,복사배열끝인덱스) 
		for(int i=0;i<newStrArray.length;i++) {
			System.out.print(newStrArray[i]+"  ");
		}


	}

}
