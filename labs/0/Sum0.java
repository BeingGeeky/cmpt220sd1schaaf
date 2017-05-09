/*
file: Sum0.java
author: Cassie Schaaf, SD1, January 31
course: CMPT 200
assignment: lab 0
due date: January 31
version: 1.4

This file contains the code to break down a 1-3 digit number into single digits and add those digits together into a single digit number
*/
import java.util.Scanner;

public class Sum0  {
  public static void main(String[] args){
    //Cassie Schaaf, SD1, January 31

    //declared variables
    int number;
    int numberOne;
    int numberTwo;
    int numberThree;
    int digitOne;
    int digitTwo;
    int digitThree;
    int total;

    //number input request
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number between 0 and 1000: ");
    number = input.nextInt();

    //break down number into single digits
    digitOne = number % 10;
    numberOne = number / 10;
    digitTwo = numberOne % 10;
    numberTwo = numberOne / 10;
    digitThree = numberTwo % 10;
    numberThree = numberTwo / 10;

    //add single digits together
    total = digitOne + digitTwo + digitThree;

    //return single digit value
    System.out.println("The sum of the digits is: " + total);
  }
}
