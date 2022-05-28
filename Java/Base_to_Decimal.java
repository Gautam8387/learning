/*
Write a Program to convert any Base Value to any other decimal value 
*/

import java.util.*;
 public class Main {
   public static int getValue(int n, int b){
     int returnValue = 0;
     int power = 1;
     while(n>0){
       returnValue = returnValue + (n%10)*power;
       power=power*b;
       n=n/10;
     }
     return returnValue;
   }

   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    int baseValue = getValue(n, b);
    System.out.println("Value of "+b+" base number "+n+" in decimal is: "+baseValue);
   }
}
