package ch02_java_0723;

public class Println_f {
		
	String s;
	
	
	public static boolean isIt(int yy) {
		boolean result = false;
		if(yy >= 50) {
			System.out.printf("����");
			result = true;
		} else {
			System.out.printf("���");
		}
		return result;
	}
	
	
	
	public static void main(String[] agrs) {
//		System.out.printf("�̸�: %1$1s, ����: %2$s" , "Ƽ��", 25);
		
		
		Println_f y = new Println_f();
		
		y.s = "banana";
		y.isIt(5);
	
		
		int var = 100;
		System.out.printf(y.s + ":" + "%d��", var );
		
		
		
		
		
		
		
		
		
		
	
 }
}