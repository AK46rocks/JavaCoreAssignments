package com.cj.assignments;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number: ");
	    int num= sc.nextInt();
        
	    if (isPrimeNumber(num))
            System.out.println(num+" is a prime Number");
 
        else
            System.out.println(num+" is not a prime Number");
    }
	
	static boolean isPrimeNumber(int n)
    {
 
        // Check if number is less than
        // equal to 1
        if (n <= 1)
            return false;
 
        // Check if number is 2
        else if (n == 2)
            return true;
 
        // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;
 
        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
 
}
