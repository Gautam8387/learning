/*

Write a Program to Inverse an Array
For Example:
int array[5] = {2, 4, 1, 0, 3};
Should have an inverse arry of:
int inv[5] = [3, 2, 0, 4, 1];

*/

import java.util.*;
 public class Main {
   
   public static void ArrayInverse(int[] arr){
     int[] inv = new int[arr.length];
     
     for(int i = 0; i < arr.length; i++)
     {
       int val = arr[i];
       inv[val] = i;
     }
     
     for (int i=0; i<inv.length; i++)
     {
       System.out.print(inv[i]+ " ");
     }
   }
   
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++)
      arr[i] = scn.nextInt();
    
    ArrayInverse(arr);
  } 
}
