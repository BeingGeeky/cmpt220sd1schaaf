/*
file: Grades2.java
author: Cassie Schaaf, SD1, February 2
course: CMPT 220
assignment: lab 2
due date: February 7, 2017
version: 1.0

This file contains the code to calculate the final course grade based on the CMPT220 rubric, translated into A-F scale
*/
import java.util.Scanner;

public class Grades2 {
  public static void main(String[] args) {

    //declare variables
    double homework;
    double midterm;
    double project;
    double finals;
    double total;
    String letterGrade;

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

    if (total < 60.0){
      letterGrade = "F";
    } else if (total < 70.0){
      letterGrade = "D";
    } else if (total < 80.0){
      letterGrade = "C";
    } else if (total < 90.0){
      letterGrade = "B";
    } else if (total < 100.0){
      letterGrade = "A";
    } else letterGrade = "ERROR: insufficient data";

    //display final course grade as a letter grade
    System.out.println("Final Grade for Software Development I: " + letterGrade);
  }
}
