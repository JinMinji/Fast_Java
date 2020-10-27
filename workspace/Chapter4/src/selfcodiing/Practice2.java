package selfcodiing;

import java.util.Scanner;

public class Practice2 {
	
	public static void main(String[] args) {
		System.out.println("홀수 값을 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		
		int starnum = scanner.nextInt();
		int spacenum = starnum / 2 + 1 ;
		int starcount = 1;
		
		for (int i = 0; i < starnum ; i++) {
			
			for (int j = 0 ; j < spacenum; j++) {
				System.out.print(' ');
			}
			for (int j = 0 ; j < starcount; j++) {
				System.out.print('*');
			}
			for (int j = 0 ; j < spacenum; j++) {
				System.out.print(' ');
			}
			
			if (i < starnum/2) {
				starcount += 2;
				spacenum--;
			}
			else {
				starcount -= 2;
				spacenum++;
			}
			
			
			System.out.println();
		}
		
	}
	
}
