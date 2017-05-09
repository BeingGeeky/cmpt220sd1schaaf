/*
file: plateNumbers.java
author: Cassie Schaaf
course: CMPT220
assignment: lab 2-4.25
due date: February 7, 2017
version: 1.0

This file contains the code to lab 2 - problem 4.25 generate vehicle plate numbers. Write a program to generate a plate number of 3 uppercase letters followed by 4 digits.
*/

public class PlateNumbers{
  public static void main(String[] args){

    int randomNum1 = (int) ((Math.random()*(90-65)) +65);
    int randomNum2 = (int) ((Math.random()*(90-65)) +65);
    int randomNum3 = (int) ((Math.random()*(90-65)) +65);
    int randomNum4 = (int) ((Math.random()*(57-48)) +48);
    int randomNum5 = (int) ((Math.random()*(57-48)) +48);
    int randomNum6 = (int) ((Math.random()*(57-48)) +48);
    int randomNum7 = (int) ((Math.random()*(57-48)) +48);

    char plateChar1 = (char)randomNum1;
    char plateChar2 = (char)randomNum2;
    char plateChar3 = (char)randomNum3;
    char plateChar4 = (char)randomNum4;
    char plateChar5 = (char)randomNum5;
    char plateChar6 = (char)randomNum6;
    char plateChar7 = (char)randomNum7;

    //int randomNumInt = (int) (randomNum);
    System.out.println("Your license plate number is: " + plateChar1 + plateChar2 + plateChar3 + " " + plateChar4 + plateChar5 + plateChar6 + plateChar7);
    //declare variabes
  }
}
