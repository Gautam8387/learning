/*

	Write a Program to check is a number is prime or not

*/

// Executed on the online java compiler : https://onecompiler.com/java/3y4hnrq7t


/* Name of the class has to be "Main" only if the class is public. */

import java.util.*;

public 
class IsPrime{

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter a Number: ");
        int num = scr.nextInt();
        for(int div = 1; div<=num; div++)
        {
            if(num % div == 0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
        scr.close();
    }

}


