package ch02_java_project;

public class Order {

	public String orderNum;
	public String orderId;
	public String orderDay;
	public String customerName;
	public String productNum;
	public String shippingAddress;
	
	public void orderInfo() {
		System.out.println("주문 번호 : " + orderNum);
		System.out.println("주문자 아이디 : " + orderId);
		System.out.println("주문 날짜 : " + orderDay);
		System.out.println("주문자 성명 : " + customerName);
		System.out.println("주문한것 : " + productNum);
		System.out.println("주소 : " + shippingAddress );
	}
	
	public static void main(String[] args) {
		
		Order james = new Order();
		
		james.orderNum = "00010001";
		james.orderDay = "2021년 11월 21일";
		james.orderId = "jamieXX";
		
		james.orderInfo();
		
	}
	
	
}
