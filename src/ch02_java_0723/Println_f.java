package ch02_java_0723;

public class Println_f {
		
	String s;
	
	
	public static boolean isIt(int yy) {
		boolean result = false;
		if(yy >= 50) {
			System.out.printf("존맛");
			result = true;
		} else {
			System.out.printf("노맛");
		}
		return result;
	}
	
	
	
	public static void main(String[] agrs) {
//		System.out.printf("이름: %1$1s, 나이: %2$s" , "티모", 25);
		
		
		Println_f y = new Println_f();
		
		y.s = "banana";
		y.isIt(5);
	
		
		int var = 100;
		System.out.printf(y.s + ":" + "%d원", var );
		
		
		
		
		
		
		
		
		
		
	
 }
}