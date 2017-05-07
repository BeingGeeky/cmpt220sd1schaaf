/*
file: Lab 5 7.20 Revise Selection Sort.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 5-7.20 Revise Selection Sort
due date: March 1, 2017
version: 1.0

This file contains the code to 7.20 Revise selection sort. 
*/
import java.util.Scanner;

public class SelectionSort {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 double numbers.");
    //array input
    double[] list = new double[10];

    for (int n = 0; n < 10; n++){
      list[n] = input.nextDouble();
    }
    
    //prints array
    System.out.println("Array you input is:   ");
    for (int a =0; a < list.length;a++){
      System.out.print(list[a] +" ");
    }
    
    //
    for (int i = 0; i < list.length - 1; i++){
      double currentMin = list[i];
      int currentMinIndex = i;
      
      //
      for (int j = i + 1; j < list.length; j++) {
        if (currentMin < list[j]) {
          currentMin = list[list.length - 1];
          currentMinIndex = j;
        }
      }
      
      //
      if (currentMinIndex != i){
        list[currentMinIndex] = list[i];
        list[i] = currentMin;
      }
    }
    System.out.println("\n The rearranged array is: ");
    for (int p = 0; p < list.length; p++){
    System.out.print(list[p] + " ");
    }
  }
}
  
