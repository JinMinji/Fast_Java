package classpart;

class ABC {
	
}

public class Student { //class���Ͽ� public class�� �� �ϳ�, class�̸��� �����ؾ� �Ѵ�.
	
	private int studentID; // public - ����������(Access Modifier)
	public String studentName; //���ڿ�. java���� �����ϴ� Ŭ���� char[]��� String���� ���ϰ� ���
	public String address;
	
	// ��� ���� = �Ӽ�
	
	public Student(int id, String name) {
		
		studentID = id;
		studentName = name;
		address = "�ּ� ����";
	}
	
	public void showStudentInfo() { //��ȯ�ϴ� ���� ������, void. �Ű����� ���� �� ����
		System.out.println(studentName + ", " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	// Ŭ���̾�Ʈ ���忡�� �̸� ����. give�� �ƴ϶� get
	
}

// ������ ����
