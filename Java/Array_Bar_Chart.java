/*
Write a Program to Print a bar chart of array values.
Example: int array[5] = {3, 1, 0, 5, 7}; prints the following:

				*	
				*	
			*	*	
			*	*	
*			*	*	
*			*	*	
*	*		*	*


*/

import java.util.*;
 public class Main {
   
   public static void BarChart(int[] arr)
   {
     int max = arr[0];
     for(int i=1;i<arr.length;i++)
      if (arr[i]>max)
        max = arr[i];
        
     for(int floor = max; floor > 0; floor--)
     {
       for(int building = 0; building<arr.length; building++)
       {
         if(floor <= arr[building])
          System.out.print("*\t");
         else
         System.out.print("\t");
       }
       System.out.println();
     }
   }
   
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++)
    {
      arr[i] = scn.nextInt();
    }
    BarChart(arr);
  } 
}
