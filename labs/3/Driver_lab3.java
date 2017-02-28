/*
file: Driver_lab3.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 3-Kattis Different Distances
due date: February 21, 2017
version: 1.0

This file contains the code to the Kattis challenge Different Distances.
*/

import java.util.Scanner;

public class Driver_lab3 {
  public static void main(String[] args){

    //Scanner declarations
    Scanner input = new Scanner(System.in);
    double x1= input.nextDouble();
    double y1=input.nextDouble();
    double x2=input.nextDouble();
    double y2=input.nextDouble();
    double p=input.nextDouble();

    //Formula
    double answer = Math.pow(((Math.abs((Math.pow((x1-x2),p)))) + (Math.abs((Math.pow((y1-y2),p))))),(1/p));

    //Answer print
    System.out.printf("Amount = %.10f", answer);
  }
}
