/*
file: Lab 5 7.32 Partition of a list.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 5-7.32 Partition of a list
due date: March 1, 2017
version: 1.0

This file contains the code to 7.32  Partition of a list
*/
import java.util.Scanner;

public class PartList {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of integers in the list and then the numbers that comprise the list.");
    
    //array input
    int arrayLength = input.nextInt();
    int[] part = new int[arrayLength];
    for (int n = 0; n < arrayLength; n++){
      part[n] = input.nextInt();
    }//end for loop
    printArray(part, arrayLength);

  //  partition(listNumbers);
    int pivot = part[0];
    int lastSpot=arrayLength-1;
    int temp=0;
    temp = part[lastSpot];
  //  part[lastSpot]= temp;
    part[0]=part[lastSpot];
    part[lastSpot]= temp;
    //  if (partList[0]<pivot){
    //  part[i]=part[]
   // }
    System.out.println("\n The rearranged array is: ");
    printArray(part, arrayLength);
  }//end main method

  
 
  public static void printArray(int[] array, int arrayLength){
    //method to print array
    for (int n=0; n < arrayLength; n++){
    System.out.print(array[n] + " ");
    }//end for statement
  }//end print array method
/*
  public static int[] partition(int[] list){
    for (int i = 0; i < list.length-1; i++){
      int currentMaxIndex = i;
      for (int j = i+1; j < list.length; j++) {
        if (list[currentMaxIndex] > list[j]) {
          currentMaxIndex = j;
        }//end if loop
      }//end for loop
      
      if (currentMaxIndex != i){
        int temp = list[i];
        list[i] = list[currentMaxIndex];
        list[currentMaxIndex] = temp;
      }//end if loop
    }//end outer for loop
    return list;
  }//end selectionSort method  
  */
}//end program

