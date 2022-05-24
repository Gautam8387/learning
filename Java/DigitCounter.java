/*
	Write a Program to count number of digits in a number
*/

// Executed on the online java compiler : https://onecompiler.com/java/3y4hnrq7t


/* Name of the class has to be "Main" only if the class is public. */


import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner scr = new Scanner(System.in);
      int count = 0, n;
      //System.out.print("Enter a Number: ");
      n = scr.nextInt();
      while(n>0){
          n = n / 10;
          count++;
      }
      System.out.println(count);
   }
  }
