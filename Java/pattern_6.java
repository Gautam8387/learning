/*
Write a Program to print the pattern 

1												1	
1	2										2	1	
1	2	3								3	2	1	
1	2	3	4						4	3	2	1	
1	2	3	4	5				5	4	3	2	1	
1	2	3	4	5	6		6	5	4	3	2	1	
1	2	3	4	5	6	7	6	5	4	3	2	1	
	
  
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
        
        int n = scn.nextInt();   
        int Spaces = 2*n-3, Stars = 1, val=1;
        
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=Stars; j++)
            {
                System.out.print(val+"\t");
                val++;
            }
            
            for (int j=1; j<=Spaces; j++)
                System.out.print("\t");
            
            if(i==n)
            {
                Stars--;
                val--;
            }
            
            for (int j=1; j<=Stars; j++)
            {
                val--;                
                System.out.print(val+"\t");
            }
            
            Spaces= Spaces-2;
            Stars++;
            System.out.println();
        }
    }
}
