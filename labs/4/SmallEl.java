/*
file: SmallEl.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 3-7.9 Smallest Element
due date: February 21, 2017
version: 1.0

This file contains the code to

(Find the smallest element) Write a method that finds the smallest element in an array of double values using the following header:                          *
 * public static double min(double[] array)                                       *
 * Write a test program that prompts the user to enter ten numbers, invokes this method to return the minimum value, and displays the minimum value.   
 */

import java.util.Scanner;

public class SmallEl {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 10 decimal numbers. ");

		double[] bubble = new double[10];
		for (int n = 0; n < 10; n++) {
			bubble[n] = input.nextDouble();
		}
		System.out.println(min(bubble));
	}
	public static double min(double[] array){
		double minimum = array[0];
		for (int i=1; i < array.length; i++){
			if (array[i] < minimum){
				minimum = array[i];
			}
		}
		return minimum;	
	}
}
// Test numbers: 100.0 20.34 54.2 5.2 4.3 2.3 5.43 543.0 45.0 5.8