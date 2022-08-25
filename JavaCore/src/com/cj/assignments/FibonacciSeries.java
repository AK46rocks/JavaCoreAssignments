package com.cj.assignments;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String args[])  
	{    
		 int n1=0,n2=1,n3;
		
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the range: ");
	     int range= sc.nextInt();
		 
		 //print 0 and 1
		 System.out.print(n1+" "+n2);    
		    
		//loop starts from 2 because 0 and 1 are already printed
		 for(int i=2; i<range; ++i)    
		 {    
		    n3=n1+n2;    
		    System.out.print(" "+n3);    
		    n1=n2;    
		    n2=n3;    
		 }    
    }
}
