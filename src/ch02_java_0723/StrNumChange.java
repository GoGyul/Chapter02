package ch02_java_0723;

public class StrNumChange {

	public static void main(String[] args) {
		
		
		
// Integer.parseInt �޼��带 ����ؼ� ���ڿ��� ������ ��ȯ
//									 ( "x" , n ); / ������ n�� n���������� ����� ����
		int value1 = Integer.parseInt("11231",10);
		double doubleValue1 = Double.parseDouble("132.10029");
		
		System.out.println(value1);
		System.out.println(doubleValue1);
//		System.out.println("val1+douVa1 : " +value1 + doubleValue1); �̷��� �ϸ� ���ڿ��� ������
		double addTwo = value1 + doubleValue1;
		System.out.println(addTwo);
		
		String str1 = String.valueOf(13.22);
		System.out.println(str1);
		
		//�� ��ȯ
		int num1 = 1313;
		byte num2 = 111;
//		byte result = num1 + num2; �� �Ұ�� int�� �ڵ������� �� ��ȯ�� �Ǳ⶧���� byte�� ����Ҽ�����
		byte result = (byte)(num1 + num2); // ����ڷ� ���������� ����ȯ ����ߵ�, �� �ս��� �Ͼ�� ����
		System.out.println("result1 : " + result);

		
		// ���� �� ��ȯ�� �ʿ� ���� ��� �ΰ��� �ٸ� ���� ���ϸ� �� ������ ���� �ڵ������� �� ��ȯ�̵�
		int num3 = 10021;
		double num4 = 3.1231;
		double result2 = num3 + num4;
		System.out.println("result2 : " + result2);
		
		
		//int �� ���� �� ��ȯ
		int num5 = 132;
		double num6 = 32.3002;
		int result3 = num5+ (int) num5;
		System.out.println("result3 : " + result3);
	}

}
