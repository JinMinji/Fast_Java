package chapter5;

public class Order {

	long orderID;
	String customerID;
	String orderDate;
	String customerName;
	String orderProductNum;
	String address;
	
	public void showOrderInfo() {
		System.out.println("�ֹ� ��ȣ : " + orderID);
		System.out.println("�ֹ��� ���̵� : " + customerID);
		System.out.println("�ֹ� ��¥ : " + orderDate);
		System.out.println("�ֹ��� �̸� : " + customerName);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + orderProductNum);
		System.out.println("��� �ּ� : " + address);
	}
}
