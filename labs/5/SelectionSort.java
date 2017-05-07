/*
file: Lab 5 7.20 Revise Selection Sort.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 5-7.20 Revise Selection Sort
due date: March 1, 2017
version: 1.0

This file contains the code to 7.20 Revise selection sort. In Section 7.11, you used selection sort to sort an array. The selection-sort method repeatedly finds the smallest number in the current array and swaps it with the first. Rewrite this program by finding the largest numbers and swapping it with the last. Write a test program that reads in ten doubl numbers, invokes the method, and displays the sorted numbers.
*/
import java.util.Scanner;

public class SelectionSort {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 double numbers.");
    
    //array input
    double[] listNumbers = new double[10];
    for (int n = 0; n < 10; n++){
      listNumbers[n] = input.nextDouble();
    }//end for loop
    
    selectionSort(listNumbers);

    System.out.println("\n The rearranged array is: ");
    printArray(listNumbers, listNumbers.length);
  }//end main method

  public static void printArray(double[] array, double arrayLength){
    //method to print array
    for (int n=0; n < arrayLength; n++){
    System.out.print(array[n] + " ");
    }//end for statement
  }//end print array method

  public static void selectionSort(double[] list){
    for (int i = 0; i < list.length-1; i++){
      int currentMaxIndex = i;
      for (int j = i+1; j < list.length; j++) {
        if (list[currentMaxIndex] > list[j]) {
          currentMaxIndex = j;
        }//end if loop
      }//end for loop
      
      if (currentMaxIndex != i){
        double temp = list[i];
        list[i] = list[currentMaxIndex];
        list[currentMaxIndex] = temp;
      }//end if loop
    }//end outer for loop
  }//end selectionSort method
  
}//end program

