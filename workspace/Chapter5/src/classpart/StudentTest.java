package classpart;

public class StudentTest {
	// main���� �������� �뵵
	public static void main(String[] args) {//������ ������ ���� �ۼ�
		
		Student studentLee = new Student(1, "�̼���"); //������. �޸𸮿� ������
//		studentLee.studentName = "�̼���";
		studentLee.address = "����";
		
		studentLee.showStudentInfo();
		
		
		Student studentKim = new Student(2,"������");
//		studentKim.studentName = "������";
//		studentKim.address = "����";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee); // class�� Ǯ����(��Ű������� ���Ե� Ŭ������)
		System.out.println(studentKim); //@�ּҰ�(���ּҴ� �ƴϰ�, ���������� ������� �ؽ��ּ�)
		
	}

}
