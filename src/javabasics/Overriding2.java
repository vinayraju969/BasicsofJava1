package javabasics;

public class Overriding2 extends Overriding1{
	
	public void A() {
		System.out.println("I need car");
		
		
	}

	public static void main(String[] args) {
		Overriding2 ov = new Overriding2();
		ov.A();
		
	}
	
}
