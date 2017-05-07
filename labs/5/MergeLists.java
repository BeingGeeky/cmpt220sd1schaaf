/*
file: Lab 5 7.31 Merge two sorted lists.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 5-7.31 Merge two sorted lists
due date: March 1, 2017
version: 1.0

This file contains the code to 7.31 
/*********************************************************************************
* (Merge two sorted lists) Write the following method that merges two sorted     *
* lists into a new sorted list.                                                  *
*                                                                                *
* public static int[] merge(int[] list1, int[] list2)                            *
*                                                                                *
* Implement the method in a way that takes at most list1.length + list2.         *
* length comparisons. Write a test program that prompts the user to enter two    *
* sorted lists and displays the merged list. Here is a sample run. Note that the *
* first number in the input indicates the number of the elements in the list.    *
* This numberis not part of the list.                                            *
*********************************************************************************/

import java.util.Scanner;

public class MergeLists {
  public static void main(String[] args){

System.out.println("Enter an array length and array elements for the first array.");
	Scanner input = new Scanner(System.in);
int firstLength = input.nextInt();
int[] firstList = new int[firstLength];

for  (int p = 0; p<firstList.length; p++){
  firstList[p] = input.nextInt();
}
System.out.println("Enter an array length and array elements for the second array.");
int secondLength = input.nextInt();
int[] secondList = new int[secondLength];

for  (int p = 0; p<secondList.length; p++){
  secondList[p] = input.nextInt();
}

//sort array
int[] combinedArray = merge(firstList, secondList);

//sort array
bubbleSort(combinedArray);

//print array
printArray(combinedArray, combinedArray.length);

  }//end main method

public static void printArray(int[] array, int arrayLength){
  //method to print array
  System.out.println("\nThe array is ");
  for (int n=0; n < arrayLength; n++){
    System.out.print(array[n] + " ");
    }//end for statement
}//end print array method

public static void bubbleSort(int[] array){
  //method to sort array
  int n = array.length;
  int temp = 0;
  for (int i = 0; i < n; i++){
    for (int j=1; j < (n-i); j++){
      if (array[j-1] > array[j]){
        temp = array[j-1];
        array[j-1] = array[j];
        array[j] = temp;
      }//end if statement 
    }//end of inner for loop
  }//end for loop
}//end bubbleSort method

public static int[] merge(int[] list1, int[] list2){
  int[] comboList = new int[list1.length + list2.length];
  System.arraycopy(list1, 0, comboList, 0, list1.length);
  System.arraycopy(list2, 0, comboList, list1.length, list2.length);
  int comboLength = comboList.length;
  
  return comboList;
}//end merge method
}//end program
  
