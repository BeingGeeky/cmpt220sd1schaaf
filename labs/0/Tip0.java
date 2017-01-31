/*
file: Tip0.java
author: Cassie Schaaf, SD1, January 31
course: CMPT 200
assignment: lab 0
due date: January 31
version: 1.4

This file contains the code to calculate the total and tip for a subtotal
*/
import java.util.Scanner;

public class Tip0 {
  public static void main(String[] args) {
    //Cassie Schaaf, SD1, January 31

    //declare variables
    double gratuity;
    double subtotal;
    double total;
    double tip;

    //subtotal and gratuity rate input requests
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the subtotal: ");
    subtotal = input.nextDouble();

    System.out.println("Enter the gratuity rate: ");
    gratuity = input.nextDouble();

    //calcuate tip & total
    tip = subtotal * (gratuity/100);
    total = subtotal + tip;

    //print results to screen
    System.out.println("The gratuity is $" + tip + " and total is $" + total);
  }
}
