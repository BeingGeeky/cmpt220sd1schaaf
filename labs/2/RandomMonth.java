/*
file: 3.4 RandomMonth.java
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
    int monthNumber;
    String month;

    //random number generator
    monthNumber = (int)(Math.random() * 12) + 1;

    //Find month
    if (monthNumber == 1){
      month = "January";
    } else if (monthNumber == 2){
      month = "March";
    } else if (monthNumber == 4){
      month = "April";
    } else if (monthNumber == 5){
      month = "May";
    } else if (monthNumber == 6){
      month = "June";
    } else if (monthNumber == 7){
      month = "July";
    } else if (monthNumber == 8){
      month = "August";
    } else if (monthNumber == 9){
      month = "September";
    } else if (monthNumber == 10){
      month = "October";
    } else if (monthNumber == 11){
      month = "November";
    } else month = "December";

    //Print results
    System.out.println(month);
  }
}
