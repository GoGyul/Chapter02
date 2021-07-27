package ch02_java_project;

public class fishBread {

	private String ff;
	
	// setFf 메서드를 이용해 String ff 객체변수에 대입하게됨
	public void setFf(String ff) {
		this.ff = ff;
	}
	
	public String getFf() {
		return this.ff;
	}
	
	public static void main(String[] args) {
		fishBread yaso = new fishBread();
		yaso.setFf("banana");
		
		System.out.println(yaso.getFf());
	}
	
}
