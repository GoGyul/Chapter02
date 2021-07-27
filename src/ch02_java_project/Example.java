package ch02_java_project;

public class Example {

	public static void main(String[] args) {
		
		Student a_student = new Student();
		
//		a_student.val1 = 1;
		a_student.val2 = 2;
		a_student.val3 = 0;

		
		System.out.println(a_student.getVal2());
		System.out.println(a_student.getVal3());
	}

}
