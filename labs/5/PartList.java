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

  // pivot
    int pivot = part[0];//assign first pivot location
    int lastSpot=arrayLength-1;//last spot of array
    int pivotLoc = 0;//initial pivot location
    int temp=0;//placeholder
    

    int spotLoc = 0;
    
    if (pivot>part[spotLoc+1]){
      part[spotLoc] = part[spotLoc++];
      part[spotLoc++] = pivot;
      spotLoc++;
    } else{
      //swap to end
      temp=part[spotLoc];
      part[spotLoc]=part[lastSpot];
      part[lastSpot]= temp;
      pivot = part[lastSpot];
    }

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

