package chapter5;

public class OrderTest {
	
	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderID = 201907210001L;
		order.customerID = "abc123";
		order.orderDate = "2019�� 7�� 21��";
		order.customerName = "ȫ���";
		order.orderProductNum = "PD0345-12";
		order.address = "����� �������� ���ǵ��� 20����";
		
		order.showOrderInfo();
				
	}
	

}
