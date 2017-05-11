/*
file: Lab 7 10.2
author: Cassie Schaaf
course: CMPT 220
assignment: lab 7 - 10.2 BMI class
due date: May 10, 2017
version: 1.0

This file contains the code to 10.2 BMI class


UML:
------------------------------
|          BMI           |
------------------------------
| row: int                    |
| column: int                 |
| maxValue: double            |
------------------------------
| locateLargest(): double[][] |
------------------------------
*/
import java.util.Scanner;

   public class BMI{ 
     private String name;
     private int age;
     private double weight;
     private double height;
     public static final double KILOGRAMS_PER_POUND = 0.45359237;
     public static final double METERS_PER_INCH = 0.0254;
     
     public BMI (String name, int age, double weight, double height){
       this.name = name;
       this.age = age;
       this.weight = weight;
       this.height = height;
     } //end bmi
     
     public BMI(String name, double weight, double height) {
       this(name, 20, weight, height);
     }//end bmi
     
     public BMI(String name, int age, double weight, double feet, double inches){
     }//end bmi
     
     public double getBMI(){
       double bmi = weight * KILOGRAMS_PER_POUND /
           ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
       return Math.round(bmi * 100)/100;
     }//end getBMI
     
     public String getStatus(){
       double bmi= getBMI();
       if (bmi<18.5){
         return "Underweight";
       } else if (bmi<25) {
         return "Normal";
       } else if (bmi < 30) {
         return "Overweight";
       } else return "Obese";
       }//end getStatus
     
     public String getName() {
       return name;
     }//end getName
     
     public int getAge(){
       return age;
     }//end getAge
     
     public double getWeight(){
       return weight;
     }//end getWeight
     
     public double getHeight(){
       return height;
     }//end getHeight
  }//end program

