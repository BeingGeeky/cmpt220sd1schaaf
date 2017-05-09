/*
file: Lab 6 9.13
author: Cassie Schaaf
course: CMPT 220
assignment: lab 6 - 9.13 Location class
due date: March 1, 2017
version: 1.0

This file contains the code to 9.13 the Location class


UML:
------------------------------
|          Location           |
------------------------------
| row: int                    |
| column: int                 |
| maxValue: double            |
------------------------------
| locateLargest(): double[][] |
------------------------------
*/
import java.util.Scanner;

public class LocationObj {
  public static void main(String[] args){
    // int row = 0;
    // int column = 0;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the number of rows and columns in the array:");
    int row = input.nextInt();
    int column = input.nextInt();

    double[][] matrix = new double[row][column];
  
    System.out.println("Enter the array:");

    //fill array
    for (int i=0; i < matrix.length; i++){
      for (int n = 0; n < matrix[i].length; n++){
        matrix[i][n] = input.nextDouble();
      }//inner for loop
    }//outer for loop

    Location location1 = new Location(row, column, matrix);
    location1.locateLargest(row, column, matrix);

  }//end main method

  static class Location{
    int row;
    int column;
    double maxValue;
    double[][] arrayMatrix;

    Location(){
    }//end constructor

    Location(int newRow, int newColumn, double[][] newArray){
      row = newRow;
      column = newColumn;
      arrayMatrix = newArray;
    }

    public static Location locateLargest(int row, int column, double array[][]){

      int maxRow=0;
      int indexOfMaxRow = 0;
      int r=0;
      int c=1;

      for(int x = 0; x < array.length; x++){
        for (int y = 0; y < array[x].length; y++){
          if (array[maxRow][indexOfMaxRow] < array[x][y]){
            maxRow=x;
            indexOfMaxRow=y;
          }//if loop
        }//end inner for loop
      }//end for loopf
    
      int[] result = new int[2];
      result[0]=maxRow;
      result[1]=maxRow;
      double maxResult = array[maxRow][indexOfMaxRow];

      Location location2 = new Location(maxRow, indexOfMaxRow, array);
      System.out.println("The location of the largest element is "+maxResult +" at (" + maxRow+", "+indexOfMaxRow+")");

      return location2;
    }//end locateLargest 
  }//end location class
}//end program

