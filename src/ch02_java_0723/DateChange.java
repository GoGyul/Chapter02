package ch02_java_0723;

public class DateChange {

	public static void main(String[] args) {
	
		int iv = 500;
		byte bv = (byte)iv;
		
		System.out.println(bv);
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		int intValue = byteValue1 + byteValue2;
		System.out.println(intValue);
		
		char charValue1 = 'A'; // �ڵ� �� ��ȯ �����ڵ� ���� ���� ������
		char charValue2 = 1;
		int intValue2 = charValue1 + charValue2; //char���� ���̳ʽ� ���� ���Եɼ� ���⿡ char Ÿ������ ���ΰ� ���Ѱ��� ������ �ټ� ����
		System.out.println(intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 =10;
		double doubleValue = intValue5/1.2;
		System.out.println(doubleValue);
		
		
		
		int x1 = 10;
		double x2 = 3;
		double result1 = x1/x2;
		System.out.println("result1 : " + result1);
		

	}

}
