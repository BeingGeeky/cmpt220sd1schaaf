/*
file: 3.4 randomMonth.java
author: Cassie Schaaf, SD1, February 3
course: CMPT 220
assignment: lab 2-3.4
due date: February 7, 2017
version: 1.0

This file contains the code to Lab 2: Problem 3.4 Random Month generator and text display using if and/or if-else statements
*/
import java.util.Scanner;

public class RandomMonth {
  public static void main(String[] args){
 
//declare variables
  double month;

//random number generator
  month = Math.random()*12;

  System.out.println(month);
  }
}
