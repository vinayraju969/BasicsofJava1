package javabasics;

import java.util.ArrayList;
import java.util.List;

public class Collections {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	
	@SuppressWarnings("rawtypes")
    //List data= new ArrayList();
	ArrayList data= new ArrayList();
	data.add("vinay");
    data.add("seshu");
    data.add(1);
    //System.out.println(data);
   /* for(String a :data) {
    	System.out.println(a);
    	
    }
    */
    
    data.add(2, "testing");
    System.out.println(data);
    System.out.println(data.get(2));

	
}
}
