package com.cj.assignments;

import java.util.Scanner;

public class PalindromeString {

	 public static void main(String args[])
	    {
		       String x, y = "";
		       Scanner sc = new Scanner(System.in);
		       System.out.print("Enter a String:");
		       x = sc.nextLine();
		       int l = x.length();
	       
	        for(int k = l - 1; k >= 0; k--)
	       {
	          y = y + x.charAt(k);
	       }
	       
	      if(x.equalsIgnoreCase(y))
	        {
	            System.out.println("The string is palindrome.");
	        }
	        else
	        {
	            System. out.println("The string is not a palindrome.");
	        }
	    }
}
