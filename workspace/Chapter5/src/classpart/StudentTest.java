package classpart;

public class StudentTest {
	// main으로 돌려보는 용도
	public static void main(String[] args) {//메인은 별도로 빼서 작성
		
		Student studentLee = new Student(1, "이순신"); //생성자. 메모리에 생성됨
//		studentLee.studentName = "이순신";
		studentLee.address = "서울";
		
		studentLee.showStudentInfo();
		
		
		Student studentKim = new Student(2,"김유신");
//		studentKim.studentName = "김유신";
//		studentKim.address = "경주";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee); // class의 풀네임(패키지명까지 포함된 클래스명)
		System.out.println(studentKim); //@주소값(실주소는 아니고, 내부적으로 만들어진 해시주소)
		
	}

}
