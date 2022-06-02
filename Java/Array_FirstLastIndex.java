/*

Write a Program to execute return First and Last index of a repeating element in an Array

*/

import java.util.*;
 public class Main {
   
   public static void FirstLastIndex(int[] arr, int x){
     int left = 0;
     int right = arr.length - 1;
     
     int first =-1;
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
         first = mid;
         right = mid -1;
       }
     }
    
     left = 0;
     right = arr.length - 1;
     int last = -1;
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
         last = mid;
         left = mid + 1;
       }

     }
    System.out.println("first: " + first + "\nlast: "+last);
   }
   
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++)
      arr[i] = scn.nextInt();
      
    int x = scn.nextInt();  
    
    FirstLastIndex(arr, x);
  } 
}
