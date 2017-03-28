/*
file: Driver_prj1.java
author: Cassie Schaaf
course: CMPT 220
assignment: Project 1
due date: March 28, 2017
version: 1.0

This file contains the code to clean heart rate data
*/

import java.util.Scanner;

public class Driver_prj1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    /*receives data for two vectors from standard input
     * has a method that implements the convolution operation
     * send to standard output the result of the convolution
     * 
     */
    //declare array
    int Array first = new int[1 1 1];
    
    //declare array 2
    int Array second = new int[1 0 1];
    
    //declare result
    int Array result[] = new int[];
    
    //declare array position variable
    int idx=0;
    
    //calculate size
    int resultLength = (first.length + second.length)-1;
    
    //declare shift value;
    int s=0;
    
    //formula for result
    if(idx<resultlength; ;idx++){
    result[n] = sum(first[n-s]*second[s])
   
    System.out.println(n);
    System.out.println(result[]);
    
    }
  }
/*
  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    // write your code here

    return vResult;  
 */
  }

}