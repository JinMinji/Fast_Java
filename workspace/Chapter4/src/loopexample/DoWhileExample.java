package loopexample;

import java.util.Scanner;

public class DoWhileExample {
	
	public static void main(String[] args) {
		
//		int num = 1;
//		int sum = 0;
//		
//		do {
//			sum += num;
//			num++;
//		} while (num <= 10);
//		
//		// while(true) //무한루프
//		System.out.println(sum);
//		System.out.println(num);
		
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		
		do {
			input = scanner.nextInt();
			sum += input;
		} while (input != 0);
		
		System.out.println(sum);
		
		
		
	}

}
