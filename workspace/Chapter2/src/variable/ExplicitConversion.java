package variable;

public class ExplicitConversion {
	
	public static void main(String[] args) {
		
		int i = 1000;
		// byte bNum = i; //����
		byte bNum = (byte)i; // �������� �ս��� ������ ����
		
		System.out.println(bNum); // �������� ���Ƿ�, -24 ��� �ٸ� ���� ����
		// Truncate
		
		double dNum1 = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum1 + (int)fNum;
		int iNum2 = (int)(dNum1 + fNum);
		
		System.out.println(iNum1); // 1
		System.out.println(iNum2); // 2
		
	}

}
