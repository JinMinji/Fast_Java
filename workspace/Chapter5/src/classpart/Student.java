package classpart;

class ABC {
	
}

public class Student { //class���Ͽ� public class�� �� �ϳ�, class�̸��� �����ؾ� �Ѵ�.
	
	public int studentID; // public - ����������(Access Modifier)
	public String studentName; //���ڿ�. java���� �����ϴ� Ŭ���� char[]��� String���� ���ϰ� ���
	public String address;
	
	// ��� ���� = �Ӽ�
	
	public void showStudentInfo() { //��ȯ�ϴ� ���� ������, void. �Ű����� ���� �� ����
		System.out.println(studentName + ", " + address);
	}
}

// ������ ����
