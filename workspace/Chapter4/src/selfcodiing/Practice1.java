package selfcodiing;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {

		char operator ='/';
		int num1 = 10;
		int num2 = 5;
		int result = 0;
		
//		if (operator == '+') {
//			result = num1 + num2;
//		}
//		else if (operator == '-') {
//			result = num1 - num2;
//		}
//		else if (operator == '*') {
//			result = num1 * num2;
//		}
//		else {
//			result = num1/num2;
//		}
		
		switch(operator) {
			case '+':
				result = num1 + num2;
				
			case '-':
				result = num1 - num2;
				
			case '*':
				result = num1 * num2;
				
			case '/':
				result = num1 / num2;
		}
		
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		
	}

}
