package javabasics;

//Single inheritance
public class Subclass extends Superclass1{
	
	public void childmethod() {
		System.out.println("properties of child");
		
	}
	
public static void main(String[] args) {
	
	Subclass a = new Subclass();
	a.parentmethod();
	a.childmethod();
}

}
