/*
file: charASCII.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 2-4.8
due date: February 7, 2017
version: 1.0

This file contains the code to lab 2 - 4.8 find character of an ASCII code. Write a program that receives and ASCII code (int 0-127) and displays it's character
*/

import java.util.Scanner;

public class CharacterASCII{
  public static void main(String[] args){

  //Call for
  System.out.println("Enter an ASCII code:");

  Scanner input = new Scanner(System.in);

  int number = input.nextInt();

  char ch = (char)number;

  System.out.println("The character for ASCII code "+ number + " is "+ ch + ".");
  }
}
