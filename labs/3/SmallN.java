/*
file: SmallN.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 3-5.12
due date: February 21, 2017
version: 1.0

This file contains the code to lab 3- problem 5.12. Find smallest n such that n2 is greater than 12,000. Use while loop.
*/

import java.util.Scanner;

public class SmallN {
  public static void main(String[] args){

    int n = 0;
    int result=0;
    while (result <= 12000){
      result = (int)Math.pow(n,2);
      n++;
    }
    //Print answer
    System.out.println("The smallest value of n is " + (n-1));

  }
}
