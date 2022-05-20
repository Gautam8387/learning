// Write a program to calculate and print the sums of even and odd integers of the first n natural numbers.

// Executed on the online java compiler : https://onecompiler.com/java/3y4hnrq7t


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SumEvenOddUpToN
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int sum_even=0, sum_odd=0;
		while(n>0)
		{
		    if(n%2==0)
		    {
		        sum_even = sum_even + n;
		    }
		    else
		    {
		        sum_odd = sum_odd + n;
		    }
		    n--;
		}
		System.out.println("Even: "+sum_even+"\nOdd: "+sum_odd);
	}
}
