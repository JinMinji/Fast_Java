package classpart;

public class StudentTest {
	// main으로 돌려보는 용도
	public static void main(String[] args) {//메인은 별도로 빼서 작성
		
		Student studentLee = new Student(); //생성자. 메모리에 생성됨
		
		studentLee.studentName = "이순신";
		studentLee.address = "서울";
		
		studentLee.showStudentInfo();
		
	}

}
