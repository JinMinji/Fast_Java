package operator;

public class OperatorEx5 {

	public static void main(String[] args) {
		
		int num1 = 0B00001010; // 10
		int num2 = 0B00000101;
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		
		System.out.println(num2 << 1);
		System.out.println(num2 << 2);
		System.out.println(num2 << 3);
		System.out.println(num2);
		System.out.println(num2 <<= 3);
		System.out.println(num2 >> 5);
		
		
	}
	
}