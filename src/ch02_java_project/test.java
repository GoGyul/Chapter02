package ch02_java_project;

public class test {
	
	   public static class gg{
	        public final String test = "test";
	        
	        public void print() {
	            String test = "methodTest";
	            System.out.println(test);
	        }
	        
	        public void print2() {
	            System.out.println(test);
	        }
	    }
	    public static void main(String[] args) {
	        gg nn = new gg();
	        
	        nn.print();
	        nn.print2();
	    }
	
}


	

