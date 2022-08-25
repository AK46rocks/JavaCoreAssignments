package com.cj.assignments;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num= sc.nextInt();
        System.out.println("Factorial of " + num + " is " + getFactorial(num));
    }
	
	//Function to get factorial of a number
	static int getFactorial(int n)
    {
        if (n == 0) {
        	return 1;
        }
        else {
        	return n * getFactorial(n - 1);	
        }
 
    }
 
    
}
