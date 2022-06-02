/*

Write a Program to execute return all the subsets of an array
For example: array[3] = {1,2,3}; has:
- - -
- - 3
- 2 -
- 2 3
1 - -
1 - 3
1 2 -
1 2 3 
as all subsets
*/

import java.util.*;
 public class Main {
   
  public static void Subset(int[] arr){
    /* Total subset = 2^n -1
    Position to wirte an element (for n=3) => 2^3-1 = 8
    0 = 0 0 0
    1 = 0 0 1
    2 = 0 1 0
    3 = 0 1 1
    4 = 1 0 0
    5 = 1 0 1
    6 = 1 1 0
    7 = 1 1 1
    Follows binary
    */
    int limit = (int)Math.pow(2, arr.length);
    for(int i =0; i<limit; i++)
    {
      String set = "";
      int temp = i;
      //Onvert i to Binary and use 0's and 1's to know if to print an element or not.
      for(int j = arr.length-1; j>=0; j--){
        int r = temp%2;
        temp = temp/2;
        if(r==0){
          set = "-\t" + set;
        }
        else{
          set = arr[j] + "\t" + set;
        }
      }
      System.out.println(set);
    }
  }
   
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++)
      arr[i] = scn.nextInt();
      
    Subset(arr);
  } 
}
