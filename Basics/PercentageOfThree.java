/*

	Write a Program to input marks of 3 subjects out of 100 and calculate percentage. 

*/

// Executed on the online java compiler : https://onecompiler.com/java/3y4hnrq7t


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class PercentageOfThree
{
    
    public static double percentage(double a, double b, double c)
    {
        double total = a + b + c;
		return (total/300)*100;   
    }
    
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		double sub1, sub2, sub3;
		Scanner scr = new Scanner(System.in);
		sub1 = scr.nextDouble();
		sub2 = scr.nextDouble();
		sub3 = scr.nextDouble();
		
		System.out.println("Percentage: " + percentage(sub1, sub2, sub3) + "%");
		
	}
}
