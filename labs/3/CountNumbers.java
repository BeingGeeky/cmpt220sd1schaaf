/*
file: CountNumbers.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 3-5.1
due date: February 21, 2017
version: 1.0

This file contains the code to lab 3- problem 5.1. Count positive & negative numbers and give average
*/

import java.util.Scanner;

public class CountNumbers {
  public static void main(String[] args){

    //variables & inputs
    Scanner input = new Scanner(System.in);
    int pos =0;
    int neg =0;
    int count = 0;
    double total=0.0;
    int num;

    //do while to count numbers
    do {
      num = input.nextInt();
      if (num > 0){
        pos++;
      } else if (num <0) {
        neg++;
      }
      count++;
      total=num+total;
    } while(num != 0);
    //calc average
    double average = total/(count-1);

    //Print answer
    System.out.println("The number of positives is " + pos);
    System.out.println("The number of negatives is "+ neg);
    System.out.println("The total is " + total);
    System.out.println("The average is " + average);
  }
}
