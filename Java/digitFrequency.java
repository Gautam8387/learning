
/*
Write a Program to counter number of frequency of digit d in a number n 
*/

// Executed on the online java compiler : https://onecompiler.com/java/3y4hnrq7t

import java.util.*;
 public class Main {
   
   public static int digitCounter(int n, int d){
     int setCounter=0;
     while(n>0){
      if(n%10 == d)
        setCounter++;
      n = n/10;
     }
     return setCounter;
   }
   
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int d = scn.nextInt();
    int counter = digitCounter(n, d);
    System.out.println("Number of digit "+d+" are: "+counter);
   } 
}
