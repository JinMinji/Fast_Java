package classpart;

public class FuctionTest {
	
	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	public static int calcSum() {
		int sum = 0;
		
		int i;
		
		for (i = 0; i < 101; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int n1 = 5;
		int n2 = 10;
		
		int total = addNum(n1, n2);
		System.out.println(total);
		sayHello("Hello world");
		int hundredsum = calcSum();
		System.out.println(hundredsum);
		
		
	}

}
