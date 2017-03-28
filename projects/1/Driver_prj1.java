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
    int[] first = new int[3];
    
    //input & fill "first" array
    int firstInput=input.nextInt();
    //***loop to fill
    
    //declare array 2
    int[]second = new int[1];
    second[0]= bill;
    
    
    
    //declare result
  //  int[] result = new int[0];
    
    //declare array position variable
 //   int idx=0;
    
    //calculate size
 //   int resultLength = (first.length + second.length)-1;
    
    //declare shift value;
 //   int s=0;
    
    //formula for result
 //   if(idx<resultlength; ;idx++){
 //   result[n] = sum(first[n-s]*second[s])
   
  //  System.out.println(i);
    System.out.println(second[0]*2);
    
    }
  }
/*
  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    // write your code here

    return vResult;  
 */
//  }

//}