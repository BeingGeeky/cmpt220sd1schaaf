/*
file: CelFah.java
author: Cassie Schaaf
course: CMPT 220
assignment: lab 3-6.8 Convert between celcius & fahrenheit
due date: February 21, 2017
version: 1.0

This file contains the code to

Notes:    fahrenheit = (9.0 / 5) * celsius + 32
          celsius = (5.0 / 9) * (fahrenheit – 32)
*/

import java.util.Scanner;

public class CelFah {
  public static void main(String[] args){
	  /*user enters degrees
	  user determines the temp entered
	  if string is F or f, run fahToCel
	  if string is C or c, run celToFah
	  */
	  System.out.println("Enter the temp and which type of temperature you would like to convert to: Enter '0' for Celcius or '1' for Fahrenheit and the degrees of temperature in decimal format.");
	  Scanner input = new Scanner(System.in);
	  int tempType = input.nextInt();
//	  String tempInput = input.nextLine();
//	  char tempType = tempInput.charAt(0);
	  double temp = input.nextDouble();
	  double newTemp=0;
//	  String tempType;
//	  tempType = input.nextLine();
//	  String tempTypeCase = tempType.toLowerCase();
	  System.out.println(tempType);
//	  System.out.println(tempType);
	  System.out.println(temp);
//	  System.out.println(newTemp);
	  if (tempType=='0'){
		   celsiusToFahrenheit(temp);
	  } else if (tempType=='1'){
		   fahrenheitToCelsius(temp);
	  } else {
      System.out.println("Error");
    }
	//  System.out.println("The new temperature is "+ newTemp);
  }
  public static void celsiusToFahrenheit(double celsius){
	    //fahrenheit calculation
	    double fahrenheit = (1.8 * celsius) + 32;
	    System.out.println("Celsius is " + fahrenheit + " degrees Fahrenheit");
//	    double newTemp = fahrenheit;
//	    return fahrenheit;
  }
  public static void fahrenheitToCelsius(double fahrenheit){
	    double celsius = (5.0 / 9) * (fahrenheit-32);
	    System.out.println("Fahrenheit is "+celsius+" degrees Celsius");
//	    return celsius;

  }
 }
