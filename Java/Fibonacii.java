// Write a program to print a fibonacii series up to n

// Executed on the online java compiler : https://www.codechef.com/ide
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Fibonacii
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int sum = 0;
		int first = 0, second = 1;
		while(n>0)
		{
		    System.out.print(sum + " ");
		    sum = first + second;
		    first = second;
		    second = sum;
		    n--;
		    
		}
		
	}
}
