/*
	Write a Program to print the pattern 

    *	
	*	*	*	
*	*	*	*	*	
	*	*	*	
		*	
  
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
        /*
        Spaces Stars
            2   1
            1   3
            0   5
            1   3
            2   1        
        */
        
        int Spaces = n / 2, Stars = 1; 
        for (int i = 1; i <= n; i++)
        {
            
            for(int j = 1; j<=Spaces; j++)
                System.out.print("\t");
            
            for(int k=1; k<=Stars; k++)
                System.out.print("*\t");
            
            if ( i <= n / 2)
            { 
                Spaces--;
                Stars = Stars + 2;
            }
            else
            {
                Spaces++;
                Stars = Stars - 2;
            }
            
            System.out.println();
        }    
        
        
		
	}
}
