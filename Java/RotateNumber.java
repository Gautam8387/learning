/*

Given two numbers n and k, we have to rotate the number n by k digits. 
If k is positive, right rotate the number i.e. remove k rightmost digits and make them leftmost. 
Else for negative values of k, left rotate the number, 
i.e. remove k digits from left and make them rightmost digits.

*/

// Executed on the online java compiler : https://onecompiler.com/java/3y4hnrq7t

import java.util.*;

import java.lang.*;
import java.io.*;
public class Main 
{
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int k = scn.nextInt();
    int nod = 0; //number of digits
    int temp = n;
    //temporarily storing number to perform division 
    while(temp != 0)
    {
      temp = temp/10;
      nod++;
    }
    
    k = k % nod;
    if(k<0){
        k = k + nod;
    }
    
    int div = 1; //initialize divisor = 1
    int mult = 1; //initialize multiplier = 1
    for (int i = 1; i <= nod; i++)
    {
      if (i <= k)
        //while the iterator is less than k
      {
        //we increase the value of divisor
        div = div * 10;
      }
      else
        //or else we increase the value of multiplier {
        mult = mult * 10;
    }
  int quo = n / div; // extracting the quotient int rem = n % div; // extracting the remainder
  int r = n % div;
  int rem = r * mult + quo;
  //forming the rotated number
  System.out.println(rem);
}
}
