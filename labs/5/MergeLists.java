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
    
	Scanner input = new Scanner(System.in);
int[] list = {1,4,6};
int[] list1 = {2,3,5};
int[] comboList = new int[6];
for (int i = 0; i < 2; i++){
  if (list[i]<=list1[i]){
    comboList[i]=list[i];
    comboList[i+1]=list[i];
  } else {
    comboList[i]=list1[i];
  }
}//end for list
for (int n=0; n<comboList.length; n++){
  System.out.print(comboList[n]+" ");
}
}//end main class
 /* 
public static int[] merge(int[] list1, int[] list2){

}//end merge method*/
}//end program
  
