package variable;

public class DoubleTest2 {

	public static void main(String[] args) {
		
		double dNum = 1;
		
		for( int i = 0; i < 10000; i++) {
			dNum = dNum + 0.1;
		}
		
		System.out.println(dNum);
		// 1001이라고 정확히나오지는 않음. 부동소수점방식 약간의 오차 존재
	}
}
