/*
file: Lab 6 9.13
author: Cassie Schaaf
course: CMPT 220
assignment: lab 6 - 9.13 Location class
due date: March 1, 2017
version: 1.0

This file contains the code to 9.13 the Location class


UML:
--------------------------
|     Location            |
--------------------------
| row: int           |
| column: int          |
| maxValue: double |
--------------------------
| locateLargest(): double[][] |
--------------------------|
*/
public class LocationObj {
  public static void main(String[] args){

    Location location1 = new Location();
    Location(location1);
  }//end main method

  static class Location{
    int row;
    int column;

    Location(){
    }//end constructor

    Location(int newRow, int newColumn){
      row = newRow;
      column = newColumn;
    }

    public static Location locateLargest(double[][] a){
      int maxRow=0;
      int indexOfMaxRow = 0;
      int r=0;
      int c=1;

      for(int x = 0; x < a.length; x++){
        for (int y = 0; y < a[x].length; y++){
          if (a[maxRow][indexOfMaxRow] < a[x][y]){
            maxRow=x;
            indexOfMaxRow=y;
          }//if loop
        }//end inner for loop
      }//end for loop
      int[] result = new int[2];
      result[0]=maxRow;
      result[1]=maxRow;
      System.out.println("The location of the largest element is: ("+maxRow +", "+ indexOfMaxRow+")");
      return Location;
    }
  }//end rectangle class

}//end program

