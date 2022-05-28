/*
Write a Program to convert any Base Value to another Base value 
*/
/*
First convert the number from Base_1 to Decimal then convert Decimnal number to Base_2
*/
import java.util.*;
 public class Main {
   
   public static int Decimal_To_Base(int n, int b){
     int returnValue = 0;
     int power = 1;
     while(n>0){
       returnValue = returnValue + (n%b)*power;
       power = power*10;
       n = n/b;
     }
     return returnValue;
   }
   
   public static int Base_To_Decimal(int n, int b){
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
    int b1 = scn.nextInt();
    int b2 = scn.nextInt();
    int decimalValue = Base_To_Decimal(n, b1);
    int baseValue = Decimal_To_Base(decimalValue, b2);
    System.out.println("Value of base "+b1+" number "+n+" in other base "+b2+" is: "+baseValue);
   }
}
