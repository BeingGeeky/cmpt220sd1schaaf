/*
file: BubbleSort.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 3-7.18 Bubble Sort
due date: March 1, 2017
version: 1.0

This file contains the code to

* (Bubble sort) Write a sort method that uses the bubble-sort algorithm. The bubblesort algorithm makes several passes through the array. On each pass, successive neighboring pairs are compared. If a pair is not in order, its values are swapped; otherwise, the values remain unchanged. The technique is called a bubble sort or sinking sort because the smaller values gradually “bubble” their way to the top and the larger values “sink” to the bottom.  Write a test program that reads in ten double numbers, invokes the method, and displays the sorted numbers.     
*/

import java.util.Scanner;

public class BubbleSort {
  public static void main(String[] args){
	  
  /* loop to fill array
   * loop to sort array
   * */
    
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter 10 decimal numbers. ");
	
	double[] bubble = new double[10];
	for  (int n = 0; n<10; n++){
      bubble[n] = input.nextDouble();
	}
  }	 
  
public static void bubbleSort{
	double temp = bubble[0];
	
 for (int i = 1; i < bubble.length; i++){
	 bubble[i-1] = myList[i];
	}
 bubble[bubble.length-1] = temp;
}
}
  
