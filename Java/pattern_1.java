
/*
	Write a Program to print the pattern 
      *
     **
    ***
   **** 
  *****
  
*/

// Executed on the online java compiler : https://onecompiler.com/java/3y4hnrq7t


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int spaces = n-1, stars = 1;
		
		for(int i=1; i<=n; i++)
		{
		    
		    for(int k = 1; k<=spaces; k++)
		        System.out.print("\t");
		    
		    
		    for(int j = 1; j <= stars; j++)
		        System.out.print("*\t");
		    
		    spaces--;
		    stars++;
		    
		    System.out.println(); 
		}
		
	}
}

