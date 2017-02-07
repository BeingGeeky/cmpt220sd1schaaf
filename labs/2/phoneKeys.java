/*
file: PhoneKeys.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 2-4.15
due date: February 7, 2017
version: 1.0

This file contains the code to lab 2 - problem 4.15 phoneKeys. Write a program that prompts user to enter a letter and displays its corresponding number.
*/

import java.util.Scanner;

public class PhoneKeys {
  public static void main(String[] args){

    System.out.println("Enter a letter");
    Scanner input=new Scanner(System.in);

    //Set up & process entries
    String entry=input.next();
    String letter = entry.toLowerCase();
    String number;

    //Roll through options to get key number
    if (letter.equals("a")||letter.equals("b")||letter.equals("c")){
      number="2";
    } else if  (letter.equals("d")||letter.equals("e")||letter.equals("f")){
      number="3";
    } else if  (letter.equals("g")||letter.equals("h")||letter.equals("i")){
      number="4";
    } else if  (letter.equals("j")||letter.equals("k")||letter.equals("l")){
      number="5";
    } else if  (letter.equals("m")||letter.equals("n")||letter.equals("o")){
      number="6";
    } else if  (letter=="p"||letter.equals("q")||letter.equals("r")||letter.equals("s")) {
      number="7";
    } else if  (letter.equals("t")||letter.equals("u")||letter.equals("v")) {
      number="8";
    } else number="9";

    //Print results
    System.out.println("The corresponding number to " +letter + " is " + number);
  }
}
