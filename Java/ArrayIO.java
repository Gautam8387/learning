/*
	Write a Program to take 5 inputs of an array and print the array
*/

// Executed on the online java compiler : https://onecompiler.com/java/3y4hnrq7t


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ArrayIO
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scr = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i=0;i<arr.length ;i++ ) 
		{
		    arr[i]=scr.nextInt();
		}
		for (int i=0;i<arr.length ;i++ ) 
		{
		    System.out.print(arr[i] + " ");
		}
		
	}
}
