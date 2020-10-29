package chapter5;

public class Order {

	long orderID;
	String customerID;
	String orderDate;
	String customerName;
	String orderProductNum;
	String address;
	
	public void showOrderInfo() {
		System.out.println("주문 번호 : " + orderID);
		System.out.println("주문자 아이디 : " + customerID);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문자 이름 : " + customerName);
		System.out.println("주문 상품 번호 : " + orderProductNum);
		System.out.println("배송 주소 : " + address);
	}
}
