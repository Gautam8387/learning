/*
Write a Program to multiply two number of same base.
*/

import java.util.*;
 public class Main {
   
   public static int Base_Addition(int base, int n1, int n2)
   {
     int returnSum = 0;
     int power = 1;
     int carry = 0;
     while(n2>0 || n1>0 || carry>0)
     {
       int d1 = n1%10;
       int d2 = n2%10;
       n1 = n1/10;
       n2 = n2/10;
       
       int sum = d1 + d2 + carry;
       carry = sum/base;
       sum = sum % base;
       
       returnSum = returnSum + sum*power;
       power = power * 10;
     }
     return returnSum;
   }
   
   public static int Single_Digit_Mult(int base, int n1, int d2)
   {
     int carry = 0;
     int power = 1;
     int mult_sum = 0;
     while(n1>0 || carry>0)
     {
       int d1 = n1 % 10;
       n1 = n1 / 10;
       
       int mult_digit = d1 * d2 + carry;
       carry = mult_digit/base;
       mult_digit = mult_digit % base;
       
       mult_sum = mult_sum + mult_digit*power;
       power = power * 10;
     }
     return mult_sum;
   }

   public static int Base_Mult(int base, int n1, int n2)
   {
     int returnMult = 0;
     int power = 1;
     
     while(n2>0)
     {
       int d2 = n2 % 10;
       n2 = n2/10;
       
       int single_product = Single_Digit_Mult(base, n1, d2);
       returnMult = Base_Addition(base, returnMult, single_product*power);
       power = power * 10;
     }
     return returnMult;
   }
   
   public static void main(String[] args) 
   {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();
    int multiplication = Base_Mult(b, n1, n2);
    System.out.println("Multiplication of two numbers "+n1+" and "+n2+" in base "+b+" is: "+multiplication);
  }
}
