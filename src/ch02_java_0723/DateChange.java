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
		
		char charValue1 = 'A'; // 자동 형 변환 유니코드 값이 서로 더해짐
		char charValue2 = 1;
		int intValue2 = charValue1 + charValue2; //char에는 마이너스 값이 대입될수 없기에 char 타입으로 서로가 더한값을 지정해 줄수 없음
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
