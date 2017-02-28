/*
file: PalInt.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 3-6.3 Palindrome Integer
due date: February 21, 2017
version: 1.0

This file contains the code to
*/

import java.util.Scanner;

public class PalInt {

  public static void main(String[] args){
    //Print instructions
    System.out.println("Enter an integer");

    //Input scanner
    Scanner input = new Scanner(System.in);
    long num=input.nextLong();

    //Run method & Print answer
    System.out.println("The sum of the digits is " + sumDigits(num) + ".");
  }

  //Method
  public static long sumDigits(long n){
    long sum = 0;
    while(n > 0){

    //break down number into single digits
    long number = n % 10;
    sum = sum + number;
    n = n/10;
    }

    return sum;
  }
}
