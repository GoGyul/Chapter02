package ch02_java_0723;
import java.util.Scanner;

public class KeyCode {

	public static void main(String[] args) throws Exception {
		
		int keyCode;
		
//		while(true) {
//			keyCode = System.in.read();
////			System.out.println("keyCode : " + keyCode);
//			
//			// 콘솔에 q를 입력하면 while문 좋료
//			if(keyCode==113) {
//				break;
//			}
//		}
		
		
		
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열:" + inputData);
			if(inputData.equals("q")) {
				break;
			}
		}
		
		
		
		
		
		
		

	}

}
