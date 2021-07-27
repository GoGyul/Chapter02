package ch02_java_project;

public class Calculator {

	
	int int1, int2;

    // 매개변수를 받는 생성자 생성
	public  Calculator(int num1, int num2){
		int1 = num1;
		int2 = num2;
	}

	public static void main(String[] args){
		System.out.println("Calculator start");

		int a = 10;
		int b = 15;

        // 객체정의
		Calculator calc = new Calculator(a, b);

		System.out.println(a + " + " + b + " = " + calc.add());
		System.out.println(a + " - " + b + " = " + calc.subtract());
		System.out.println(a + " * " + b + " = " + calc.multiply());
		System.out.println(a + " / " + b + " = " + calc.divide());
	}

	public int add(){
		return int1 + int2;
	}

	public int subtract(){
		return int1 - int2;
	}

	public int multiply(){
		return int1 * int2;
	}

	public int divide(){
		return int1 / int2;
	}

}
