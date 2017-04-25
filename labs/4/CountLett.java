/*
file: CountLett.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 3-6.20 Count letters in a string
due date: February 21, 2017
version: 1.0

This file contains the code to

(Count the letters in a string) Write a method that counts the number of letters in a string using the following header:
public static int countLetters(String s)
Write a test program that prompts the user to enter a string and displays the number of letters in the string.
*/

import java.util.Scanner;

public class CountLett {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String message =input.nextLine();
    System.out.println(countLetters(message));
  }
  public static int countLetters(String word){
   int countWord = word.length();
   
  return countWord;
  }
}
