package javabasics;

public class ConstructorInJava {
	int id;
	String name;
	//constructor is a one type of method in java
	ConstructorInJava(int a,String b) {
		this.id=a;
		this.name=b;
		
		System.out.println("id number is "+id);
		System.out.println("employee name is "+name);
		
		
	}
public static void main(String[] args) {
	
	ConstructorInJava cn = new ConstructorInJava(100, "vinay");

	ConstructorInJava cn1 = new ConstructorInJava(101, "seshu");
	ConstructorInJava cn2 = new ConstructorInJava(102, "shireesha");
	
	
}
}
