/*
file: Lab 7 10.10
author: Cassie Schaaf
course: CMPT 220
assignment: lab 7 - 10.10 Queue class
due date: May 10, 2017
version: 1.0

This file contains the code to 10.10 the Queue class
*/

public class QueueClass {
  public static void main(String[] args){
   Queue queue = new Queue();
   
   for (int i=0; i< 20; i++){
     queue.enqueue(i);
   }//end for
   
   while (!queue.empty()){
     System.out.print(queue.dequeue() + " ");
   }//end while
  }//end main

public class Queue{
  private int[] elements;
  private int size;
  public static final int DEFAULT_CAPACITY = 8;
  
  public Queue(){
    this (DEFAULT_CAPACITY);
  }//end queue
  
  public Queue(int capacity){
    elements = new int[capacity];
  }//end queue
  
  public void enqueue(int value){
    if (size >= elements.length) {
      int[] temp = new int[elements.length * 2];
      System.arraycopy (elements, 0, temp, 0, elements.length);
      elements = temp;
    }//end if
    
    elements[size++] = value;
  }
    public int dequeue(){
      return elements[size -1];
    }//end pop
    
    public int peek(){
      return elements[--size];
    }//end peek
  
    public boolean empty(){
      return size ==0;
    }//end empty
    
    public int getSize(){
      return size;
    }//end size
  }//end queue
}//end program
  
