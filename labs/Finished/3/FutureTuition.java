/*
file: FutureTuition.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 3-5.7
due date: February 21, 2017
version: 1.0

This file contains the code to lab 3- problem 5.7 that computes future tuition. $10,000 to start with 5% increase. Tuition in 10 years and total cost of 4 years of tuition. Use For loop.
*/

import java.util.Scanner;

public class FutureTuition {
  public static void main(String[] args){

    double tuition = 10000;
    int numberYearsElapsed = 0;
    double totTuition=0;

    for (int i=0;i<=14;i++){
      double tuitionIncrease = tuition*.05;
      tuition = tuitionIncrease + tuition;
      numberYearsElapsed++;
      if (numberYearsElapsed>11){
        totTuition = tuition + totTuition;
      }
    }
    System.out.println("Tuition: " + tuition + " Total tuition:" + totTuition);
  }
}
