/*

Write a Program to execute Binary Search in an Array

*/

import java.util.*;
 public class Main {
   
   public static void BinarySearch(int[] arr, int x){
     int left = 0;
     int right = arr.length - 1;
     
     while(left<=right)
     {
       int mid = (left + right)/2;

       if(x > arr[mid])
       {
         left = mid + 1;
       }
       else if(x < arr[mid])
       {
         right = mid -1;
       }
       else 
       {
         break;
       }

     }

    if(left<=right)
    {
      System.out.println("Found");
    }
    else{
      System.out.println("Not Found");
    }
   }
   
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++)
      arr[i] = scn.nextInt();
      
    int x = scn.nextInt();  
    
    BinarySearch(arr, x);
  } 
}
