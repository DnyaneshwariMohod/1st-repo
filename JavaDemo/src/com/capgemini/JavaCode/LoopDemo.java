//Java program by using : for, while, do while loop
package com.capgemini.JavaCode;

public class LoopDemo {
	public static void main(String[] args) 
	{

	  // for loop
	  for(int i=1,j=1; i<10||j<10;i++,j++)
	  { 
		  j++;
		  System.out.println("i="+i+" and j="+j); 
	  }


	  // while loop 
		  int i=1,j=1;
		  while(i<10 || j<10)
		  { 
			  i++; j++;
		      System.out.println("i="+i+" and j="+j); 
		  }	
		
	// Do while loop
		int a = 1, b = 1;
		do {
			a++;
			b++;
			System.out.println("i=" + a + " and j=" + b);
		    } while (a < 10 || b < 10);
	}


}
