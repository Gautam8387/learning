/*
Write a Program to Reverse an Array
*/

import java.util.*;
 public class Main {
   
   public static void ArrayReverse(int[] arr){
     int[] arr_rev = new int[arr.length];
     int i = 0;
     int j = arr_rev.length - 1;
     while(i<arr.length)
     {
       arr_rev[j] = arr[i];
       i++;
       j--;
     }
     for (int k = 0; k<arr_rev.length; k++)
      System.out.print(arr_rev[k] + " ");
   }
   
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++)
      arr[i] = scn.nextInt();
    
    ArrayReverse(arr);

  } 
}
