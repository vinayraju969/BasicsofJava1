package javabasics;

import java.util.HashMap;
import java.util.Map;

public class Collection2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		Map<Integer ,String> map = new <Integer,String>HashMap();
		map.put(11221, "vinay");
		map.put(11222, "seshu");
		//System.out.println(map);
		for (Map.Entry<Integer,String> test : map.entrySet())  
            System.out.println("Key = " + test.getKey() + ", Value = " + test.getValue());
		
		
		
		

	}

}
