package chap03.sec09;

public class BitShiftExample2 {

	public static void main(String[] args) {
		int value = 772; // [00000000] [00000000] [00000011] [00000100]
		
		// 우측으로 3byte(24bit) 이동하고 끝 1byte만 읽음
		byte byte1 = (byte)(value >>> 24);
		int int1 = byte1 & 255;
			System.out.println("첫 번째 바이트 부호 없는 값 : " + int1);
		
		// 우측으로 2byte(16bit) 이동하고 끝 1byte만 읽음 [00000000]
		byte byte2 = (byte)(value >>> 16);
		int int2 = Byte.toUnsignedInt(byte2);
			System.out.println("두 번째 바이트 부호 없는 값 : " + int2);
		
		// 우측으로 1byte(8bit) 이동하고 끝 1byte만 읽음 [00000011]	
		byte byte3 = (byte)(value >>> 8);
		int int3 = byte3 & 0xff;
			System.out.println("세 번째 바이트 부호 없는 값 : " + int3);
		
		// 끝 1byte만 읽음 [00000100]
		byte byte4 = (byte)(value);
		int int4 = byte4 & 0xff;
			System.out.println("네 번째 바이트 부호 없는 값 : " + int4);
	
	
	// ================================================================================= //
			
		int value1 = 4949445;
		//[00000000] [01001011] [10000101] [11000101]
		
		
		//[00000000]
		byte byte11 = (byte)(value1 >>> 24);
		int int11 = byte11 & 0xff;
			System.out.println(int11);

		//[01001011]
		byte byte12 = (byte)(value1 >>> 16);
		int int12 = byte12 & 0xff;
			System.out.println(int12);

		//[10000101]
		byte byte13 = (byte)(value1 >>> 8);
		int int13 = byte13 & 0xff;
			System.out.println(int13);
			
		//[11000101]
		byte byte14 = (byte)(value1);
		int int14 = byte14 & 0xff;
			System.out.println(int14);
		
	
	
	
	}

}
