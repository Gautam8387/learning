/*

Write a Program to Find Ceil and Floor value for a given integer in an Array

*/

import java.util.*;
 public class Main {
   
   public static void CeilFloor(int[] arr, int x){
     int left = 0;
     int right = arr.length - 1;
     int ceil=0;
     int floor=0;
     while(left<=right)
     {
       int mid = (left + right)/2;

       if(x > arr[mid])
       {
         left = mid + 1;
         floor = arr[mid];
       }
       else if(x < arr[mid])
       {
         right = mid -1;
         ceil = arr[mid];
       }
       else 
       {
         ceil = arr[mid];
         floor = arr[mid];
         break;
       }
     }
    System.out.println("ceil: " + ceil + "\nfloor: "+floor);
   }
   
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++)
      arr[i] = scn.nextInt();
      
    int x = scn.nextInt();  
    
    CeilFloor(arr, x);
  } 
}
