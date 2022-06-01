/*
Write a Program to Rotate an Array
*/

import java.util.*;
 public class Main {
   
   public static void ArrayRotate(int[] arr, int k){

     int[] arr_rot = new int[arr.length];
     for(int i = 0; i<arr.length; i++)
     {
       arr_rot[i] = arr[(i + arr.length - k)%arr.length];
     }
     
     for(int i = 0; i<arr.length; i++)
     {
       System.out.print(arr_rot[i]+ " ");
     }
     
   }
   
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++)
      arr[i] = scn.nextInt();
    
    int k = scn.nextInt();
    
    ArrayRotate(arr, k);

  } 
}
