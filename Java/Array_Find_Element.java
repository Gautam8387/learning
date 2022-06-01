/*
Write a Program to find an element in an array
*/

import java.util.*;
 public class Main {
   
   public static void Find_element(int[] arr, int x)
   {
     int i = 0;
     while(i<arr.length)
     {
       if (arr[i] == x)
        break;
       i++;
     }
     if(i < arr.length)
      System.out.println("Found");
     else
      System.out.println("Not Found");
   }
   
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++)
    {
      arr[i] = scn.nextInt();
    }
    int x = scn.nextInt();
    Find_element(arr, x);
  } 
}
