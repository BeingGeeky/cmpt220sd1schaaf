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
    int n=input.nextInt();
    System.out.println(reverse(n));

    //Run method & Print answer
//    System.out.println("The palindrome " + reverse(number) + ".");
  }

  //Method
  public static int reverse (int number){

    int pal=0;
    while(number > 0){

    //break down number into single digits
    int digit = number % 10;
    int answer=0;
    number = number/10;
  //  System.out.println(digit);

      if (pal <= 10){
        pal = pal + digit;
      } else {
        pal = digit * 10;
      }
    }
    return pal;
  }

/*  public static int reverse(int number){

  }

  public static boolean isPalindrome(int number){

  }*/
}
