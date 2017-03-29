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
    int firstArrLength;
    System.out.println("Enter the length of the first array:");
    firstArrLength=input.nextInt();
    //declare array
    int[] first = new int[firstArrLength];
    
    //ask for second array length
    int secondArrLength;
    System.out.println("Enter the length of the second array:");
    secondArrLength=input.nextInt();
    
    //declare array
    int[] second = new int[secondArrLength];
    
    //input & fill first array
    System.out.println("Enter the "+firstArrLength+" values of the first array:");
    for (int a=0;a<firstArrLength;a++){
      first[a]=input.nextInt();
    }
    
    int p=first[0];
    System.out.println("You entered "+p);
    
    //input & fill first array
    System.out.println("Enter the "+secondArrLength+" values of the second array:");
    for (int a=0;a<secondArrLength;a++){
      second[a]=input.nextInt();
    }
    
    int q=second[0];
    System.out.println("You entered "+q);
  
    //calculate size
    int resultLength = (first.length + second.length)-1;
    
    //declare result
    int[] result = new int[resultLength];
    
    //declare array position variable
    int idx=0;   

    //declare shift value;
    int s=0;
    
   //determine which array is largest
    if (firstArrLength<secondArrLength){
    	for (int n=0;n<secondArrLength;n++){
    	  result[idx] = (first[idx-s]*second[s]);
    	  s++;
    	}
    } else {
    	for (int n=0;n<firstArrLength;n++){
    	   result[idx] = (first[idx-s]*second[s]);
    	   idx++;
    	}
    }
    
 //   while (idx)
    //formula for result
 //   result[idx] = (first[idx-s]*second[s]);
   
    //Print results to test
    System.out.println("result length "+resultLength);

/*
  public static double[] convolveVecs(double[] vFirst, double[] vSecond) {
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    // write your code here

    return vResult;  
*/
   }
}