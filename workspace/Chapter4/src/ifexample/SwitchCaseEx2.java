package ifexample;

import java.util.Scanner;

public class SwitchCaseEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int month;
		month = scanner.nextInt();
		int days = 31;
		
		switch(month) {
			case 2:
				days = 28;
				break;
			case 4: case 6: case 9: case 11:
				days = 30;
				break;
		}
		
		System.out.println(month+"���� "+days+"�� �Դϴ�.");
	}
	
}
