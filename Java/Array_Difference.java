/*
Write a Program to difference two array 
Assuming Array 2 > Array 1
*/

import java.util.*;
 public class Main {
   
   public static void ArrayDiff(int[] arr1, int[] arr2){
     
     int[] diff = new int[arr1.length > arr2.length ? arr1.length : arr2.length];
     
     int borrow = 0;
     int i = arr1.length - 1;
     int j = arr2.length - 1;
     int k = diff.length - 1;

     while(k>=0)
     {
       int arr1_val = i >= 0 ? arr1[i] : 0;
       int digit = 0;
       
       if (arr2[j] + borrow >= arr1_val)
       {
         digit = arr2[j] + borrow - arr1_val;
         borrow = 0;
       }
       else
       {
         digit = arr2[j] + 10 + borrow - arr1_val;
         borrow = -1;
       }
       
       diff[k] = digit;
       i--;
       j--;
       k--;
     }

     int index = 0;
     while(index<diff.length)
     {
       if(diff[index] == 0)
       {
         index++;
       }
       else
       {
         break;
       }
     }
     while(index<diff.length)
     {
       System.out.print(diff[index]);
       index++;
     }
  }
   
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int[] arr1 = new int[n1];
    for(int i=0; i<n1; i++)
      arr1[i] = scn.nextInt();

    int n2 = scn.nextInt();
    int[] arr2 = new int[n2];
    for(int i=0; i<n2; i++)
      arr2[i] = scn.nextInt();

    ArrayDiff(arr1, arr2);
     
  } 
}
