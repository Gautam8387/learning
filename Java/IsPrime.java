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
        System.out.print("Enter a Number: ");
        int num = scr.nextInt();
	int div = 2;
        while (div * div <= num) {
        	if (num % div == 0) {
          		break;
        	}
        	div++;
	}
        if (div * div > num) {
        	System.out.println("Number is a Prime");
      	} 
	else {
        	System.out.println("Number is not a Prime");
      	}
    
    }
}


