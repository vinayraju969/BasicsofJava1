package javabasics;

public class Overloading {
	
	public void A(int a, int b) {
		System.out.println(a+b);
		
		
	}
	
    public void A(int a, int b, int c) {
    	
    	System.out.println(a+b+c);
		
		
	}

    public static void main(String[] args) {
		Overloading data = new Overloading();
		data.A(1, 2);
		data.A(1, 2, 3);
	}
}
