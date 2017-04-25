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
	
	System.out.println("Enter 3 decimal numbers. ");
	
	int[] bubble = new int[3];
	  for  (int n = 0; n<3; n++){
      bubble[n] = input.nextDouble();
  	}
  bubbleSort(bubble);
  System.out.println("0: "+bubble[0]+ "  1: " + bubble[1] + " 2: " + bubble[2]);
  }  
public static void bubbleSort(double[] array){

  for (int i = 1; i < array.length; i++){
   double temp = array[i-1];

   if (temp > array[i]){
   array[i-1] = array[i];
   array[i] = temp;
   } 
  }
}

}
  
