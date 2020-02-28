package javabasics;

public class ExceptionHandling {
	public static void main(String[] args) {
		     try {
		         int num1=30;
		         int num2=0;
		         int output=num1/num2;
		         System.out.println ("Result: "+output);
		     }
		     catch (Exception e) {
				e.printStackTrace();
			}
		     finally {
		    	 //System.exit(0);
		    	 System.out.println("hello");
			     System.out.println("hello1");
			     System.out.println("hello2");
			     System.out.println("hello3");
			}
		    System.out.println("done");
		     
		   }
		
	}


