/*

Write a Program to Inverse an Array
For Example:
int array[4] = {3, 1, 2, 3};
Should have an sub arrays of:
[3]	
[3,	1]	
[3,	1,	2]	
[3,	1,	2,	3]	
[1]	
[1,	2]	
[1,	2,	3]	
[2]	
[2,	3]	
[3]	

*/

import java.util.*;
 public class Main {
   
   public static void ArraySubArray(int[] arr){
     for(int i=0; i<arr.length; i++)
     {
       for(int j = i; j<arr.length; j++)
       {
         for(int k = i; k<=j; k++)
         {
           System.out.print(arr[k]+"\t");
         }
         System.out.println();
       }
     }
  }
   
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++)
      arr[i] = scn.nextInt();
    
    ArraySubArray(arr);
  } 
}
