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
    int[] firstArr = new int[firstArrLength];
    
    //ask for second array length
    int secondArrLength;
    System.out.println("Enter the length of the second array:");
    secondArrLength=input.nextInt();
    
    //declare array
    int[] secondArr = new int[secondArrLength];
    
    //input & fill first array
    System.out.println("Enter the "+firstArrLength+" values of the first array:");
    for (int a=0;a<firstArrLength;a++){
      firstArr[a]=input.nextInt();
    }
    
    //input & fill first array
    System.out.println("Enter the "+secondArrLength+" values of the second array:");
    for (int a=0;a<secondArrLength;a++){
      secondArr[a]=input.nextInt();
    }
  /*
    //calculate size
    int resultLength = (first.length + second.length)-1;
    
    //declare result
    int[] result = new int[resultLength];
    
   //determine which array is largest
    for (int idx=0; idx<result.length;idx++){
    	
    	for (int s=0;s<second.length;s++){
    		if ( ((idx-s)<first.length) && ((idx-s)>=0) ){
    			result[idx] += (first[idx-s]*second[s]);
    		}
    	}
    }
    */
    
    convolveVecs(firstArr, secondArr);
    
  }

  public static int[] convolveVecs(int[] first, int [] second) {
    // write your code here
	   //ask for first array length

	    //calculate size
	    int resultLength = (first.length + second.length)-1;
	    
	    //declare result
	    int[] result = new int[resultLength];
	    
	   //determine which array is largest
	    for (int idx=0; idx<result.length;idx++){
	    	
	    	for (int s=0;s<second.length;s++){
	    		if ( ((idx-s)<first.length) && ((idx-s)>=0) ){
	    			result[idx] += (first[idx-s]*second[s]);
	    		}
	    	}
	    }
	    //Print results to test
	    for (int i=0; i < result.length; i++){
	    System.out.print(result[i] +" ");
	    }

   return result;  

   }
}