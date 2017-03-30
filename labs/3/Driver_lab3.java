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
    @SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
    //loop strts

    //double n = input.nextDouble();
//    x1 = input.nextDouble();
    double answer;
//    double x1;
//    x1 = n;

    while (true){
      double x1 = input.nextDouble();

      if (x1==0){
        break;
      }

  //    double answer;
      double y1=input.nextDouble();
      double x2=input.nextDouble();
      double y2=input.nextDouble();
      double p=input.nextDouble();

    //Formula
      answer = Math.pow(Math.pow(Math.abs(x1-x2),p) + Math.pow(Math.abs(y1-y2),p),(1/p));

    //Answer print
    //System.out.printf("%.10f", x1);
      System.out.printf("%.10f\n",answer);

    }
  }
}
