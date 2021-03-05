/**
 *  Main Class Driver that contains the test function and main
 *  Imports the TargetSum class to be able to use its functions
 */
package org.howard.edu.lsp.assignment2.test;
import org.howard.edu.lsp.assignment2.combination.TargetSum;

public class TargetSumDriver extends TargetSum {

	public static void main(String[] args) {
		
		//Initializing a new array and target number for first test

		int array[] = { 1, 2, 3, 4, 5, 6 };

		int target = 6;
		
		// Creating an object to access the methods in TargetSum class

		TargetSum ts = new TargetSum();
		
		// Using the new data set on the method for test
		
		ts.fSubSets(array, target);
		
		// New test data
		
		int array2[] = { 5,5,15,10 }; 
		int target2 = 15;
		
		System.out.println();
		
		// Using the new data set on the method for test
		
		ts.fSubSets(array2, target2);

	}

}