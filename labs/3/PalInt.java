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
    //pal becomes the input number
    int pal=input.nextInt();
    //pal is inserted into the method
    int answer = reverse(pal);
    System.out.println(reverse(answer));

    //Run method & Print answer
    //System.out.println("The palindrome " + result + ".");
  }

  //Method pal
  public static int reverse (int number){
//declare digit
    int digit=0;
    int answer=0;
    //while loop
    while(number > 0){//543

    //break down number into single digits
    //digit equals pal/input remainder 10
    //this breaks down # into single digits
    digit = number % 10; //3-4
    //number gives the remaining number to process through the loop
    number = number/10;//54-5
    //answer gives the previous number;
    answer = digit * 10;//30-40
    //prints the digit pulled out
    answer = answer + digit;
    System.out.print(answer);
    //if the remaining # is less than 10/the last single digit of number...
      if (number < 10){
   	 //take that single digit and adds it to the previous number  
        answer = answer + digit;
        //System.out.print(digit);
      } else {
    //number = digit * 10;
        System.out.println("Answer: "+answer + " ");
        System.out.println("Digit: "+digit + " ");
        System.out.println("Number: "+number+" ");
      }
    }
    return answer;

  }

 /* public static boolean isPalindrome(int number){

  }*/
}
