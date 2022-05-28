/*
Write a Program to convert Decimal Base Value to any other base value 
*/

import java.util.*;
 public class Main {

   public static int getValue(int n, int b){
     int returnValue = 0;
     int power = 1;
     while(n>0){
       returnValue = returnValue + (n%b)*power;
       n=n/b;
       power = power*10;
     }
     return returnValue;
   }
   
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    int baseValue = getValue(n, b);
    System.out.println("Value of decimal number "+n+" in base "+b+" is: "+baseValue);
   } 
}
