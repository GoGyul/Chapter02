package ch02_java_0723;

public class MyMath {

	public static void main(String[] args) {
		
		String x = "33213";
		int y = 231;
		
		int value =Integer.parseInt(x)+y;
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		long var1 =2l;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		
		int result = (int)(var1 + (int)var2 + var3 + Double.parseDouble(var4));
		System.out.println(result);
		
		byte byteValue = Byte.parseByte("10");
		System.out.println(byteValue);
		
		double doubleValue = Double.parseDouble("3.14159");
		System.out.println(doubleValue);
		
		char c1 = 'a';
		int c2 = c1 + 1;
		System.out.println((char)c2);
		
		
	}
	
}
