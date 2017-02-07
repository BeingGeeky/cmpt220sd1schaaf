/*
file: areaPolygon.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 2-4.5
due date: February 7, 2017
version: 1.0

This file contains the code to lab 2 - problem 4.5 area of a regular polygon. Use math class
*/

import java.util.Scanner;

public class AreaPolygon{
  public static void main(String[] args){

    //declare variables
    final double PI = 3.14159;

    //Call for input of number of sides
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of sides.");

    //get input for sides
    double n = input.nextDouble();

    //get input for length of sides
    System.out.println("Enter the length of a side.");
    double s = input.nextDouble();

    //area of the polygon
    double area = (n * Math.pow(s,2))/(4 * Math.tan(PI/n));

    System.out.println("The area of the polygon is " + area);
  }
}
