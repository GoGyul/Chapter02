package ch02_java_0723;

public class StrNumChange {

	public static void main(String[] args) {
		
		
		
// Integer.parseInt 메서드를 사용해서 문자열을 정수로 반환
//									 ( "x" , n ); / 정수값 n은 n진법으로의 출력을 뜻함
		int value1 = Integer.parseInt("11231",10);
		double doubleValue1 = Double.parseDouble("132.10029");
		
		System.out.println(value1);
		System.out.println(doubleValue1);
//		System.out.println("val1+douVa1 : " +value1 + doubleValue1); 이렇게 하면 문자열로 더해짐
		double addTwo = value1 + doubleValue1;
		System.out.println(addTwo);
		
		String str1 = String.valueOf(13.22);
		System.out.println(str1);
		
		//형 변환
		int num1 = 1313;
		byte num2 = 111;
//		byte result = num1 + num2; 더 할경우 int로 자동적으로 형 변환이 되기때문에 byte를 사용할수없음
		byte result = (byte)(num1 + num2); // 요로코롬 강제적으로 형변환 해줘야됨, 값 손실이 일어날수 있음
		System.out.println("result1 : " + result);

		
		// 강제 형 변환이 필요 없을 경우 두개의 다른 형을 더하면 더 정밀한 수로 자동적으로 형 변환이됨
		int num3 = 10021;
		double num4 = 3.1231;
		double result2 = num3 + num4;
		System.out.println("result2 : " + result2);
		
		
		//int 로 강제 형 변환
		int num5 = 132;
		double num6 = 32.3002;
		int result3 = num5+ (int) num5;
		System.out.println("result3 : " + result3);
	}

}
