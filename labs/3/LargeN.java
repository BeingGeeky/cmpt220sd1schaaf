/*
file: LargeN.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 3-5.13
due date: February 21, 2017
version: 1.0

This file contains the code to lab 3- problem 5.13. Find largest n such that n2 is less than 12,000. Use while loop.
*/

import java.util.Scanner;

public class LargeN {
  public static void main(String[] args){

    int  n = 0;
    int result=0;
    while (result < 12000){
      n++;
      result = (int) Math.pow(n,2);
  //    result = (int) Math.sqrt(n);
  //    n--;
    }    //Print answer
    System.out.println("The largest value of n is " + (n-1));

  }
}
