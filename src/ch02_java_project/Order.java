package ch02_java_project;

public class Order {

	public String orderNum;
	public String orderId;
	public String orderDay;
	public String customerName;
	public String productNum;
	public String shippingAddress;
	
	public void orderInfo() {
		System.out.println("�ֹ� ��ȣ : " + orderNum);
		System.out.println("�ֹ��� ���̵� : " + orderId);
		System.out.println("�ֹ� ��¥ : " + orderDay);
		System.out.println("�ֹ��� ���� : " + customerName);
		System.out.println("�ֹ��Ѱ� : " + productNum);
		System.out.println("�ּ� : " + shippingAddress );
	}
	
	public static void main(String[] args) {
		
		Order james = new Order();
		
		james.orderNum = "00010001";
		james.orderDay = "2021�� 11�� 21��";
		james.orderId = "jamieXX";
		
		james.orderInfo();
		
	}
	
	
}
