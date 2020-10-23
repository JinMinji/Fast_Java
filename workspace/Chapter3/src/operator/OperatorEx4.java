package operator;

public class OperatorEx4 {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int i1 = 2;
		
		boolean value1 = ((num1 = num1 + 10) <10) && ((i1 = i1+2) < 10);
		
		System.out.println(value1);
		System.out.println(num1);
		System.out.println(i1); // 논리곱, 앞이 false면 뒤의 내용은 연산하지않음.
		
		System.out.println();
		
		int num2 = 10;
		int i2 = 2;
		
		boolean value2 = ((num2 = num2 + 10) <10) || ((i2 = i2+2) < 10);
		
		
		System.out.println(value2);
		System.out.println(num2);
		System.out.println(i2);
		
		System.out.println();
		
		int num3 = 10;
		int i3 = 2;
		
		boolean value3 = ((num3 = num3 + 10) > 10) || ((i2 = i2+2) < 10);
		
		
		System.out.println(value3);
		System.out.println(num3);
		System.out.println(i3); // 논리합, 앞이 true면 뒤의 내용은 연산하지않음.
		
		System.out.println();
		
		int test1 = 10;
		int test2 = 20;
		
		int num = (test1>test2)? test1:test2;
		
		System.out.println(num);
		
		
		
		
		
	}

}
