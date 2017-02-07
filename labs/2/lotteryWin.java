/*
file: 3.8 SortThree.java
author: Cassie Schaaf, SD1, February 3
course: CMPT 220
assignment: lab 2-3.4
due date: February 7, 2017
version: 1.0

This file contains the code to Lab 2: Problem 3.8 Write a program that prompts the user to enter three integers and display the integers in non-decreasing order using if and/or if-else statements
*/
import java.util.Scanner;

public class LotteryWin {
  public static void main(String[] args){

    //declare variables
    System.out.println("Enter a 3 digit integer.");

    int lottery = (int)(Math.random()*1000);
    int lotteryDigit1=lottery/100;
    int lotteryDigit2=(lottery/10)%10;
    int lotteryDigit3=lottery%10;

    Scanner input=new Scanner(System.in);
    System.out.println("Enter your lottery pick (three digits):");
    int guess=input.nextInt();
    int guessDigit1=guess/100;
    int guessDigit2=(guess/10)%10;
    int guessDigit3=guess%10;
    System.out.println("The lottery number is "+lottery);
//    System.out.println(lotteryDigit1 + " "+lotteryDigit2 +" "+ lotteryDigit3);
    if (guess==lottery){
      System.out.println("Exact match: You win $10,000");
    } else if (guessDigit2==lotteryDigit1 && guessDigit2==lotteryDigit2 && guessDigit3==guessDigit1 && guessDigit3==guessDigit2){
      System.out.println("Match all digits: You win $3,000");
    } else if (guessDigit1==lotteryDigit1
        ||guessDigit1==lotteryDigit2
        ||guessDigit1==lotteryDigit3
        ||guessDigit2==lotteryDigit1
        ||guessDigit2==lotteryDigit2
        ||guessDigit2==lotteryDigit3
        ||guessDigit3==lotteryDigit1
        ||guessDigit3==lotteryDigit2
        ||guessDigit3==lotteryDigit3){
        System.out.println("Match one digit: You win $1,000");
    } else System.out.println("Sorry, no match");
  }
}
