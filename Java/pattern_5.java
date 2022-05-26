/*

Write a Program to print the pattern 

    1	
  2	3	2	
3	4	5	4	3	
  2	3	2	
    1	
  
*/

// Executed on the online java compiler : https://onecompiler.com/java/3y4hnrq7t

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        /*
        Spaces Stars
            2   1
            1   3
            0   5
            1   3
            2   1        
        */
        int Spaces = n/2, Stars = 1, val=1;
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=Spaces; j++)
                System.out.print("\t");

            int cval = val;            
            for (int j=1; j<=Stars; j++)
            {
                System.out.print(cval+"\t");
                if ( j <= Stars / 2)
                    cval++;
                else
                    cval--;
            }
            
            if(i<=n/2)
            {
                Spaces--;
                Stars=Stars+2;
                val++;
                // cval=cval+2;
            }
            else
            {
                Spaces++;
                Stars=Stars-2;
                val--;
                // cval=cval-2;
            }
            
            System.out.println();
        }
        

    }
}
