package variable;

public class ExplicitConversion {
	
	public static void main(String[] args) {
		
		int i = 1000;
		// byte bNum = i; //에러
		byte bNum = (byte)i; // 데이터의 손실은 있으나 가능
		
		System.out.println(bNum); // 데이터의 유실로, -24 라는 다른 값이 나옴
		// Truncate
		
		double dNum1 = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum1 + (int)fNum;
		int iNum2 = (int)(dNum1 + fNum);
		
		System.out.println(iNum1); // 1
		System.out.println(iNum2); // 2
		
	}

}
