/* 
 * AP CS A ~ SFHS ~ Mrs. Vollucci
 * Lab 1.2A: loop-&-a-half
 */

import java.io.*;
import java.util.*;

/*
 * INSTRUCTIONS FOR COMPLETING CODE:
 * Fill in the code below so the program runs as described.
 * Pseudocode instructions are given that you must convert
 * into code. The indentation of the code is a hint.
 * Some lines of code are given to you. 
 */

class Lab1_2PartA {
  /*
   * Has the user input several completion times for running
   * a 40 yard dash and computes the average time.
   * Precondition: The inputted time(s) must be in seconds.
   */
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Define the SENTINEL value that will signal
    // the end of user input
    double SENTINEL = -1.0;
        
    // Initialize variables to track the 40 yard dash times
    int numInputs = 0;
    double totalTime = 0;
    
    // Loop and a half to continually prompt the user for more input
    while (true) {
      // Input a new 40 yard dash time
      System.out.println("Input your 40 yard dash time (-1 to stop): ");
      double time = sc.nextDouble();
      
      // If the user inputs the SENTINEL value, end the loop
      if (time==SENTINEL) {
        break;
      }
      // Update the variables to include the new running time
      numInputs++;
      totalTime+=time;
    }  
    // Compute and print out the average running time
    double average = totalTime/numInputs;
    System.out.println("Average 40 yard dash time: " + average + " seconds.");    
     /*
      * Postcondition: 
      * Returns average time of inputs in seconds.
      */
  }
}

