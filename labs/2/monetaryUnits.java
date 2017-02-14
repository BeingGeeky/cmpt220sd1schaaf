/*
file: MonetaryUnits.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 2-4.26
due date: February 7, 2017
version: 1.0

This file contains the code to lab 2 - problem 4.26 monetary units.
*/

import java.util.Scanner;

public class MonetaryUnits{
  public static void main(String[] args){

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Receive the amount
    System.out.print(
    "Enter a dollar amount, including cents. For example, 11.56: ");
    //double amount = input.nextDouble();
    String amount = input.next();
    double dollarAmount= Double.parseDouble(amount);

    //pull out thousands, hundreds, tens, ones, & decimal places
    double remainingAmount = dollarAmount * 100;

    // Find the number of one dollars
    double numberOfOneDollars = Math.floor(remainingAmount / 100);
    remainingAmount = remainingAmount % 100;

    // Find the number of quarters in the remaining amount
    double numberOfQuarters = Math.floor(remainingAmount / 25);
    remainingAmount = remainingAmount % 25;

    // Find the number of dimes in the remaining amount
    double numberOfDimes = Math.floor(remainingAmount / 10);
    remainingAmount = remainingAmount % 10;

    // Find the number of nickels in the remaining amount
    double numberOfNickels = Math.floor(remainingAmount / 5);
    remainingAmount = remainingAmount % 5;

    // Find the number of pennies in the remaining amount
    double numberOfPennies = remainingAmount;

    // Display results
    System.out.println("Your amount " + amount + " consists of");
    System.out.println("    " + numberOfOneDollars + " dollars");
    System.out.println("    " + numberOfQuarters + " quarters ");
    System.out.println("    " + numberOfDimes + " dimes");
    System.out.println("    " + numberOfNickels + " nickels");
    System.out.println("    " + numberOfPennies + " pennies");

    //System.out.println(numberOfOneDollars);
  }
}
