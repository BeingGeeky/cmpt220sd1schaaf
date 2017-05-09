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
Display to chart
*/

import java.util.Scanner;

public class CelFah {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

	  System.out.println("Enter the temp and which type of temperature you would like to convert to: Enter '0' to convert Celcius to Fahrenheit or '1' to convert Fahrenheit to Celcius and the degrees of temperature in decimal format.");
	  int tempType = input.nextInt();
	  double temp = input.nextDouble();
	  System.out.println("Celsius     Fahrenheit     |     Fahrenheit     Celsius");
	  System.out.println("__________________________________________________________________");
	  if (tempType==0){
	    celsiusToFahrenheit(temp);
	  } else if (tempType==1){
    fahrenheitToCelsius(temp);
	  } else {
    System.out.println("Error");
  }
	//  System.out.println("The new temperature is "+ newTemp);
  }
  public static double celsiusToFahrenheit(double celsius){
	//fahrenheit calculation
	double fahrenheit = (1.8 * celsius) + 32;
	System.out.println(celsius + “    “ fahrenheit + "          ");
	double newTemp = fahrenheit;
	return fahrenheit;
  }
  
  public static double fahrenheitToCelsius(double fahrenheit){
	double celsius = (5.0 / 9) * (fahrenheit-32);
	System.out.println("Fahrenheit is "+celsius+" degrees Celsius");
	return celsius;
  }
}
