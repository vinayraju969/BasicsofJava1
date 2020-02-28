package javabasics;

public class Javaprograms {

	// non static variables
	String data = "vinay";
	String username = "seshu";
	int a = 100;

	// static variables
	static String username1 = "sirisha";
	static int b = 200;

	// non static method
	public void sample() {
		
		// local variables
		String username2 = "praveen";
		int c = 300;
		
		System.out.println("calling non static method");

	}

	// static method
	public static void sample1() {

		System.out.println("calling static method");

	}

	// how to call nonstatic method using class name
	public static void main(String[] args) {

		Javaprograms jp = new Javaprograms();
		jp.sample();
		sample1();
		System.out.println(jp.data);
		System.out.println(jp.a);
		
		//to call static variables
		System.out.println(username1);
		System.out.println(b);
		

	}

}
