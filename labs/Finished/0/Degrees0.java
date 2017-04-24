/*
file: Degrees0.java
author: Cassie Schaaf, SD1, January 31
course: CMPT 200
assignment: lab 0
due date: January 31
version: 1.4

This file contains the code to convert a Celsius value into Fahrenheit
*/
import java.util.Scanner;

public class Degrees0 {
  public static void main(String[] args){
    //Cassie Schaaf, SD1, January 31

    //declare variables
    double celsius;
    double fahrenheit;

    //Print text to request input of Celius value
    System.out.println("Enter a degree in Celsius: ");
    Scanner input = new Scanner(System.in);
    celsius = input.nextDouble();

    //fahrenheit calculation
    fahrenheit = (1.8 * celsius) + 32;
    System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
  }
}
