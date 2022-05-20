// Write a program to check if a Number is Palindrome or not

// Executed on the online java compiler : https://www.codechef.com/ide
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int temp, digit, sum = 0;
		temp = n;
		while(n!=0)
		{
		    digit = n % 10;
		    sum = (sum*10) + digit;
		    n = n/10;
		}
		if(sum==temp)
		{
		    System.out.println("Palindrome");
		}
		else
		{
		    System.out.println("Not Palindrome");
		}
	}
}
