package com.cj.assignments;

import java.util.Scanner;

public class ArmstrongNumber {

	 public static void main(String[] args)
	    {
	        int n;
	        int temp;
	        int p = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number: ");
	        n= sc.nextInt();
	        temp = n;
	 
//	        function to calculate the sum of individual digits
	        while (n > 0) {
	 
	            int rem = n % 10;
	            p = p + (rem * rem * rem);
	            n = n / 10;
	        }
	 
//	         condition to check whether the value of P equals  to user input or not. 
	        if (temp == p) {
	            System.out.println("Yes. It is an Armstrong Number");
	        }
	        else {
	            System.out.println("No. It is not an Armstrong Number");
	        }
	    }
}
