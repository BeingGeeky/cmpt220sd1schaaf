/*
file: Lab 5 8.13 LargestEl.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 5-8.13 Largest Element in Array
due date: March 1, 2017
version: 1.0

This file contains the code to 8.13 Largest element in array
/*********************************************************************************
* (Locate the largest element) Write the following method that returns the       *
* location of the largest element in a two-dimensional array.                    *
*                                                                                *
* public static int[] locateLargest(double[][] a)                                *
*                                                                                *
* The return value is a one-dimensional array that contains two elements. These  *
* two elements indicate the row and column indices of the largest element in the *
* two-dimensional array. Write a test program that prompts the user to enter a   *
* two-dimensional array and displays the location of the largest element in the  *
* array.                                                                         *
*********************************************************************************/
*/
import java.util.Scanner;

public class BubbleSort {
  public static void main(String[] vargs){
	  
  /* loop to fill array
   * loop to sort array
   * */
    
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter 10 decimal numbers. ");
	
	double[] bubble = new double[10];
	  for  (int n = 0; n<10; n++){
      bubble[n] = input.nextDouble();
  	}
  bubbleSort(bubble);
  System.out.println("The sorted array is: ");
  for (int x= 0; x < bubble.length; x++){
    System.out.print(bubble[x] +"  ");
  }
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
  
