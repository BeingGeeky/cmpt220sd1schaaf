/*
file: Lab 5 8.13 LargestEl.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 5-8.13 Largest Element in Array
due date: March 1, 2017
version: 1.0

This file contains the code to 8.13 Largest element in array
/*********************************************************************************
* (Locate the largest element) Write the following method that returns the *
* location of the largest element in a two-dimensional array.*
**
* public static int[] locateLargest(double[][] a)*
**
* The return value is a one-dimensional array that contains two elements. These*
* two elements indicate the row and column indices of the largest element in the *
* two-dimensional array. Write a test program that prompts the user to enter a *
* two-dimensional array and displays the location of the largest element in the*
* array. *
*********************************************************************************/

import java.util.Scanner;
import java.util.Arrays;

public class LargestEl {
  public static void main(String[] vargs){

    	Scanner input = new Scanner(System.in);

	    System.out.println("Enter the array parameters:");
    int rowL = input.nextInt();
    int columnL = input.nextInt();

    double [][] matrix = new double[rowL][columnL];

	    System.out.println("Enter" + rowL + " rows & " + columnL + " columns");	

    //fill array
    for (int i=0; i < matrix.length; i++){
      for (int n = 0; n < matrix[i].length; n++){
        matrix[i][n] = input.nextDouble();
      }//inner for loop
    }//outer for loop

	    int maxRow=0;
	    int indexOfMaxRow = 0;
	    int r=0;
	    int c=1;
	
	    for(int x = 0; x < matrix.length; x++){
	      for (int y = 0; y < matrix[x].length; y++){
	        if (matrix[maxRow][indexOfMaxRow] < matrix[x][y]){
	          maxRow=x;
	          indexOfMaxRow=y;
	        }//if loop
      	}//end inner for loop
    }//end for loop
	
	    System.out.println("The location of the largest element is: ("+maxRow +", "+ indexOfMaxRow+")");
  }//end main class
}//end program

