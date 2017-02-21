/*
file: Driver_lab3.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 3-Kattis Different Distances
due date: February 21, 2017
version: 1.0

This file contains the code to lab 3- problem 5.13. Find largest n such that n2 is less than 12,000. Use while loop.
*/

import java.util.Scanner;

public class Driver_lab3 {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    double x1= input.nextDouble();
    double x2=input.nextDouble();
    double y1=input.nextDouble();
    double y2=input.nextDouble();
    double p=input.nextDouble();

    int number = input.nextInt();

    double xValue= x1-x2;
    double yValue= y1-y2;
    double xSquared=Math.pow(xValue,p);
    double ySquared=Math.pow(yValue,p);
    double xAbs = Math.abs(xSquared);
    double yAbs = Math.abs(ySquared);
    double pExp = 1/p;
    double xPlusY = xAbs + yAbs;
    double answer = Math.pow(xPlusY,pExp);

         System.out.println(answer);

  }
}
