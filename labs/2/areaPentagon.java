/*
file: AreaPentagon.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 2-4.1
due date: February 7, 2017
version: 1.0

This file contains the code to lab 2 - problem 4.1 area of a pentagon. Write a program that prompts the user to enter the length from the center of a pentagon to a vertex and computes the area of the pentagon. Variable r. Use math class.
*/

import java.util.Scanner;

public class AreaPentagon {
  public static void main(String[] args){

    //declare variables
    double area;
    double s;
    double tan;

    //double r;
    final double PI = 3.14159;

    //Call to enter length
    System.out.println("Enter the length from the center of a pentagon to a vertex to find the area of the pentagon.");

    //input data
    Scanner input = new Scanner(System.in);

    //calculate area
    double r = input.nextDouble();
    s = 2 * r * Math.sin(PI/5);
    area = (5 * Math.pow(s,2)) / (4 * Math.tan( PI/5));

    //Print answer
    System.out.println("The area of the pentagon is " + area);

  }
}
