/*
file: Lab 6 9.1
author: Cassie Schaaf
course: CMPT 220
assignment: lab 6 - 9.1 Rectangle class
due date: March 1, 2017
version: 1.0

This file contains the code to 9.1 The Rectangle Class


UML:
--------------------------
|     Rectangle           |
--------------------------
| width: double           |
| height: double          |
--------------------------
| getArea(): double       |
| getPerimeter(): double  |
--------------------------|
*/
public class RectangleObj {
  public static void main(String[] args){

    Rectangle rectangle1 = new Rectangle(4.0, 40.0);
    System.out.println("The width of rectangle1 is " + rectangle1.width);
    System.out.println("The height of rectangle1 is " + rectangle1.height);
    System.out.println("The area of rectangle1 is " + rectangle1.getArea());
    System.out.println("The perimeter of rectangle1 is " + rectangle1.getPerimeter() + "\n");
 
    Rectangle rectangle2 = new Rectangle(3.5, 35.9);
    System.out.println("The width of rectangle2 is " + rectangle2.width);
    System.out.println("The height of rectangle2 is " + rectangle2.height);
    System.out.println("The area of rectangle2 is " + rectangle2.getArea());
    System.out.println("The perimeter of rectangle2 is " + rectangle2.getPerimeter());
  }//end main method

  static class Rectangle{
    double width;
    double height;

    Rectangle(){
    }//end constructor

    Rectangle(double newWidth, double newHeight){
      width = newWidth;
      height = newHeight;
    }

    //area method
    double getArea(){
      return width*height;
    }//end area

    //perimeter method
    double getPerimeter(){
      return (width + width) + (height + height);
    }//end perimeter
  }//end rectangle class

}//end program

