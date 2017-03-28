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
    //ask for first array length
    int firstArrLength = 0;
    System.out.println("Enter the length of the first array:");
    int who=input.nextInt();
    //declare array
    int[] first = new int[firstArrLength];
    
    //ask for second array length
    int secondArrLength = 0;
    System.out.println("Enter the length of the second array:");
    int what=input.nextInt();
    
    //declare array
    int[] second = new int[secondArrLength];
    
    //input & fill first array
    System.out.println("Enter the "+firstArrLength+" values of the first array:");
    for (int a=0;a<firstArrLength;a++){
      first[a]=input.nextInt();
    }
    
 //   System.out.println("You entered "+first[0]);
    
    //input & fill second array
 //   System.out.println("Enter the "+secondArrLength+" values of the second array:");
 //   for (int a=0;a<secondArrLength;a++){
 //   second[a]=input.nextInt();
  //  }
 /*   
    //calculate size
    int resultLength = (first.length + second.length)-1;
    
    //declare result
    int[] result = new int[resultLength];
    
    //declare array position variable
    int idx=0;   

    //declare shift value;
    int s=0;
    
    //formula for result
    result[idx] = (first[idx-s]*second[s]);
   
//Print results to test
  //  System.out.println(i);
    System.out.println("F"+(second[0])+"   E"+(first[0])+"   "+resultLength);
    */
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