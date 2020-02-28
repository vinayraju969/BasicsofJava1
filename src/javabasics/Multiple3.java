package javabasics;

public class Multiple3 implements Multiple2,Multiple1{

	public void B1() {
		System.out.println("multple second class");
		
	}
		
	public void A1() {
		
		System.out.println("multple one class");
		
	}
	

	public static void main(String[] args) {
		
		Multiple3 ml = new Multiple3();
		
		ml.B1();
		ml.A1();
	}
	

}
