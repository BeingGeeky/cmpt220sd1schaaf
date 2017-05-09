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

import java.util.Scanner;

public class LargestEl {
  public static void main(String[] vargs){
    
	Scanner input = new Scanner(System.in);
int row = 0;
int column = 0;

int[][] matrix = new int[row][column];

	System.out.println("Enter the row and column numbers.");
row = input.nextInt();
column = input.nextInt();

	System.out.println("Enter " + matrix.length + " rows " + matrix[0].length );	
 
	  for  (int n = 0; n< row-1; n++){
	    int p=0;
    matrix[n][p] = input.nextInt();
    for (p = 0; p<column-1;p++){
      matrix[n][p] = input.nextInt();
    }
  	}
	  
	  int maxRow=0;
	  int indexOfMaxRow = 0;
	  
	  for(column=0; column<matrix[0].length; column++){
	    maxRow += matrix[0][column];
	  }
	  
	  for (row = 1; row < matrix.length; row++){
	    int totalOfThisRow = 0;
	    for (column = 0; column < matrix[row].length; column++){
	      totalOfThisRow += matrix[row][column];
	    }
	    if (totalOfThisRow > maxRow){
	      maxRow = totalOfThisRow;
	      indexOfMaxRow = row;
	    }
	  }
	  System.out.println("Maximum value is: ");  
  }//end main class
}//end program
  
