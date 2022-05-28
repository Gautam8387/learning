/*
Write a Program to difference two number of same base.
Assuming Number 2 > Number 1
*/

import java.util.*;
 public class Main {
   
   public static int Base_Difference(int base, int n1, int n2){
     int returnDifference = 0;
     int borrow = 0;
     int power = 1;
     
     while(n2>0){
       int d1 = n1 % 10;
       int d2 = n2 % 10;
       n1 = n1/10;
       n2 = n2/10;
       
       int difference = 0;
       d2 = d2 + borrow;
       
       if(d2 >= d1){
         borrow = 0;
         difference = d2 - d1;
       }
       else{
         borrow = -1;
         difference = d2 + base - d1;
       }
       
       returnDifference = returnDifference + difference*power;
       power = power*10;
     }
     return returnDifference;
   }
   
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();
    if(n2>=n1){
      int difference = Base_Difference(b, n1, n2);
      System.out.println("Difference of two numbers "+n2+" and "+n1+" in base "+b+" is: "+difference);
    } 
    else{
      System.out.println("ERROR!: Number 2 should be greater than Number 1!");
    }  
  }
}
