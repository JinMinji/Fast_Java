package classpart;

class ABC {
	
}

public class Student { //class파일에 public class는 단 하나, class이름과 동일해야 한다.
	
	private int studentID; // public - 접근제어자(Access Modifier)
	public String studentName; //문자열. java에서 제공하는 클래스 char[]대신 String으로 편하게 사용
	public String address;
	
	// 멤버 변수 = 속성
	
	public Student(int id, String name) {
		
		studentID = id;
		studentName = name;
		address = "주소 없음";
	}
	
	public void showStudentInfo() { //반환하는 값이 없으면, void. 매개변수 넣을 수 있음
		System.out.println(studentName + ", " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	// 클라이언트 입장에서 이름 설정. give가 아니라 get
	
}

// 메인은 따로
