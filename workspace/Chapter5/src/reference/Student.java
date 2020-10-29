package reference;

public class Student {

	int studentID;
	String studentName;
	
//	int koreaScore;
//	int mathScore;
//	int engStore;
//	
//	String koreaName;
//	String mathName;
//	String engName;
	
	// 클래스의 성격이 모호해지므로, 별도로 과목 클래스를 만든다.
	
	Subject korea;
	Subject math;
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
		//생성자에서 참조변수를 초기화 해준다.
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		
		System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
	}
	
}
