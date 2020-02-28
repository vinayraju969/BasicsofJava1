package javabasics;

public class Multilevel_inheritanceC extends Multilevel_inheritanceB{
	public void C() {
		
		System.out.println("properties of C");
	
	}
	public static void main(String[] args) {
		
		
		Multilevel_inheritanceC ml = new Multilevel_inheritanceC();
		ml.A();
		ml.B();
		ml.C();
	}
	

}
