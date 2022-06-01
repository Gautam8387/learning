/*
Write a Program to calculate the sum of two arrays
*/

import java.util.*;
 public class Main {
   
   public static void ArraySum(int[] arr1, int[] arr2){
     
     int[] sum = new int[arr1.length > arr2.length ? arr1.length : arr2.length];
     
     int carry = 0;
     int i = arr1.length - 1;
     int j = arr2.length - 1;
     int k = sum.length - 1;


     while(k>=0)
     {
       int digit = carry;
       if(i>=0)
       {
        digit = digit + arr1[i];
       }
       if(j>=0)
       {
        digit = digit + arr2[j];
       }
      
       carry = digit / 10;
       digit = digit % 10;
       sum[k] = digit;

       i--;
       j--;
       k--;
     }

    if(carry != 0)
    {
      System.out.print(carry);
    }
    for(int count=0; count<sum.length; count++)
    {
      System.out.print(sum[count]); 
    }
      
    }
   
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int[] arr1 = new int[n1];
    int n2 = scn.nextInt();
    int[] arr2 = new int[n2];
    
    for(int i=0; i<n1; i++)
      arr1[i] = scn.nextInt();
      
    for(int i=0; i<n2; i++)
      arr2[i] = scn.nextInt();
    
    ArraySum(arr1, arr2);

  } 
}
