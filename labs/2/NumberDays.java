/*
file: NumberDays.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 2-3.11
due date: February 7, 2017
version: 1.0

This file contains the code to lab 2 - problem 3.11 Find the number of days in a month. Write a program that prompts the user to enter the month and year and displays the number of days in the month using switch statements.
*/

import java.util.Scanner;

public class NumberDays {
  public static void main(String[] args){

    //call for date
    System.out.println("Enter the number of the month and the year.");
    Scanner input = new Scanner(System.in);
    int month = input.nextInt();
    int year = input.nextInt();
    //int monthDays;
    String monthText;

    boolean isLeapYear = (year % 4 ==0 && 100 !=0) || (year % 400 == 0);

    switch (month) {
      case 1: System.out.println("January " + year + "has 31 days");
        break;
      case 2:
          if (isLeapYear==true){
            System.out.println("February " + year + " has 29 days");
          } else {
            System.out.println("February " + year + " has 28 days");
          }
        break;
      case 3: System.out.println("March " + year + " has 31 days");
        break;
      case 4: System.out.println("April " + year + " has 30 days");
        break;
      case 5: System.out.println("May " + year + " has 31 days");
        break;
      case 6: System.out.println("June " + year + " has 30 days");
        break;
      case 7: System.out.println("July " + year + " has 31 days");
        break;
      case 8: System.out.println("August " + year + " has 31 days");
        break;
      case 9: System.out.println("September " + year + " has 30 days");
        break;
      case 10: System.out.println("October " + year + " has 31 days");
        break;
      case 11: System.out.println("November " + year + " has 30 days");
        break;
      case 12: System.out.println("December " + year + " has 31 days");
        break;
      default: monthText="Try another option";
    }
/*      case 2:
        if (isLeapYear==true){
          monthDays=29;
        } else {
          monthDays=28;
        }
*/

//      System.out.println(monthText + " "+ monthDays);
  }
}
