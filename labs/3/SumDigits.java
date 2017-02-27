/*
file: SumDigits.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 3-6.2 Sum digits in an integer
due date: February 21, 2017
version: 1.0

This file contains the code to
*/

import java.util.Scanner;

public class SumDigits {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
     long num=input.nextLong();
     long answer = sumDigits(num);
  }
}

public static int sumDigits(long n){
  System.out.println("Enter a number between 0 and 1000: ");
//  number = (int)input.nextLong();
  while(num >= 0){
  //break down number into single digits
  long digitOne = num % 10;
  long numberOne = num / 10;
  long digitTwo = numberOne % 10;
  long numberTwo = numberOne / 10;
  long digitThree = numberTwo % 10;
  long numberThree = numberTwo / 10;

  //add single digits together
  long total = digitOne + digitTwo + digitThree;
   return total;
  //return single digit value
  //System.out.println("The sum of the digits is: " + total);  }
}
