package chapter5;

public class OrderTest {
	
	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderID = 201907210001L;
		order.customerID = "abc123";
		order.orderDate = "2019년 7월 21일";
		order.customerName = "홍길순";
		order.orderProductNum = "PD0345-12";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		order.showOrderInfo();
				
	}
	

}
