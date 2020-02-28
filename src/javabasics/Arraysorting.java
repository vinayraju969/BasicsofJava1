package javabasics;

public class Arraysorting {
	public static void main(String[] args) {
		int a[]= {55,44,62,5}; 
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = i + 1; j < a.length; j++) 
            {
                if (a[i] < a[j]) 
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
          //  System.out.println(a[i]);
	}
        System.out.println(a[2]);

} 
}