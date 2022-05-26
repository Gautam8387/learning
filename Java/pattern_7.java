/*
Write a Program to print the pattern 

*						*	
*						*	
*						*	
*			*			*	
*		*		*		*	
*	*				*	*	
*						*	
	
  
*/

// Executed on the online java compiler : https://onecompiler.com/java/3y4hnrq7t

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Pattern 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        // write ur code here
        int n = scn.nextInt();
        int Spaces = 0, Stars = n;
        
        for (int i=1; i<=n; i++)
        {
            
           for (int j = 1; j<=n; j++) 
           {
               if(j==1 || j==n)
               {
                   System.out.print("*\t");
               }
               else if(i>n/2 && (i==j || i+j == n+1))
               {
                   System.out.print("*\t");
               }
               else
               {
                    System.out.print("\t");   
               }
           }   
           System.out.println();
        }
    }
}
