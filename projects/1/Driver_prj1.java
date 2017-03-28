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
    first[0]=firstInput;
    
    //declare array 2
    int[]second = new int[1];
    
    //input & fill "second" array
    int secondInput=input.nextInt();
    //***loop to fill
    second[0]=secondInput;
    
    //calculate size
    int resultLength = (first.length + second.length)-1;
    
    //declare result
    int[] result = new int[resultLength];
    
    //declare array position variable
    int idx;   

    //declare shift value;
    int s=0;
    
    //formula for result
    for (idx=0;idx < resultLength;idx++){
    result[idx] = (first[idx-s]*second[s]);
    }
   
//Print results to test
  //  System.out.println(i);
    System.out.println("F"+(second[0])+"   E"+(first[0])+"   "+resultLength);
    
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