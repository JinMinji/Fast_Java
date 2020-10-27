package loopexample;

public class BreakExample {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		int num;
		
		for(num = 1; ; num++) {
			sum += num;
			if (sum >= 100) {
				break;
			}
		}
		
		System.out.println(num);
		System.out.println(sum);
		
	}

}
