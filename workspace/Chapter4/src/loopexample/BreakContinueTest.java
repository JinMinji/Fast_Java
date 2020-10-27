package loopexample;

public class BreakContinueTest {
	public static void main(String[] args) {
		int dan;
		int count;
		
		for(dan = 2; dan <= 9; dan++) {
			if (dan%2 != 0) continue;
			for(count = 1; dan <= 9; count++) {
				System.out.println(dan + " x " + count + " = " + dan*count);
				if(count >= dan) break;
			}
			System.out.println();
		}
	}

}
