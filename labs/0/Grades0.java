/*
file: Grades0.java
author: Cassie Schaaf, SD1, January 31
course: CMPT 200
assignment: lab 0
due date: January 31
version: 1.4

This file contains the code to calculate the final course grade based on the CMPT220 rubric
*/
import java.util.Scanner;

public class Grades0 {
  public static void main(String[] args) {

    //declare variables
    double homework;
    double midterm;
    double project;
    double finals;
    double total;
    double homeworkPercent = 0.4;

    //Request input for rubric sections
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the grade for Homework & Labs: ");
    homework = input.nextDouble();

    System.out.println("Enter the grade for Projects: ");
    project = input.nextDouble();

    System.out.println("Enter the grade for the Midterm exam: ");
    midterm = input.nextDouble();

    System.out.println("Enter the grade for the Final exam: ");
    finals = input.nextDouble();

    //Rubric defines the following percentages: Hwk 40%, Prj/MT/F all 20%. Values below
    //Calculation of final course grade
    total = (homework * 0.4) + (project * 0.2) + (midterm * 0.2) + (finals * 0.2);

    //display final course grade
    System.out.println("Final Grade for Software Development I: " + total);
  }
}
