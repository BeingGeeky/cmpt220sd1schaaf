/*
file: Lab 5 7.32 Partition of a list.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 5-7.32 Partition of a list
due date: March 1, 2017
version: 1.0

This file contains the code to 7.32Partition of a list
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
    partition(part);

    System.out.println("\n The rearranged array is: ");
 
  }//end main method


 
  public static void printArray(int[] array, int arrayLength){
    //method to print array
    for (int n=0; n < arrayLength; n++){
      System.out.print(array[n] + " ");
    }//end for statement
  }//end print array method

  public static int[] partition(int[] list){
    int pivot = list[0];//assign first pivot location
    int lastSpot=list.length-1;//last spot of array
    int pivotLoc = 0;//initial pivot location
    int temp=0;//placeholder
    int spotLoc = 0;
    
    while(spotLoc<lastSpot){
      if (pivot>list[spotLoc+1]){
        list[spotLoc] = list[spotLoc++];
        list[spotLoc++] = pivot;
        spotLoc++;
      } else{
      //swap to end
        temp=list[spotLoc];
        list[spotLoc]=list[lastSpot];
        list[lastSpot]= temp;
        pivot = list[lastSpot];
      }//end else
    }//end while
    
    printArray(list, list.length);
    return list;
  }//end partition method

}//end program

