/*
Write a Program to sum two number of same base
*/

import java.util.*;
 public class Main {
   
   public static int Base_Sum(int base, int n1, int n2){
     int returnSum = 0;
     int power = 1;
     int carry = 0;
     
     while(n1>0 || n2>0 || carry>0){
       int d1 = n1 % 10;
       int d2 = n2 % 10;
       n1 = n1/10;
       n2 = n2/10;
       
       int sum = d1 + d2 + carry;
       carry = sum/base;
       sum = sum % base;
       
       returnSum = returnSum + sum*power;
       power = power*10;
     }
     return returnSum;
   }
   
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();
    int sum = Base_Sum(b, n1, n2);
    System.out.println("Sum of two numbers "+n1+" and "+n2+" in base "+b+" is: "+sum);
   }
}
