package ch02_java_0723;
import java.util.Scanner;

public class KeyCode {

	public static void main(String[] args) throws Exception {
		
		int keyCode;
		
//		while(true) {
//			keyCode = System.in.read();
////			System.out.println("keyCode : " + keyCode);
//			
//			// �ֿܼ� q�� �Է��ϸ� while�� ����
//			if(keyCode==113) {
//				break;
//			}
//		}
		
		
		
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("�Էµ� ���ڿ�:" + inputData);
			if(inputData.equals("q")) {
				break;
			}
		}
		
		
		
		
		
		
		

	}

}
