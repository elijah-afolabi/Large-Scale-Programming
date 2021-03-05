package org.howard.edu.lsp.assignment2.combination;


/**
 * @author Elijah Afolabi
 * @version 2.0
 * 
 */


/**
 *  Represents the Target class with the methods needed.
 */
public class TargetSum {

	
/**
 *  The method prints the sum of subsets of the sets of given integers that equals the target    .
 */
	
	public void addSubsets(int theSet[], int n, int targetNum) {
  
		// Create an array with a particular size 
		int x[] = new int[theSet.length];
		int l = theSet.length - 1;

		
		// Converts the array into a binary array 
		while (n > 0) {
			x[l] = n % 2;
			n = n / 2;
			l--;
		}

		int sum = 0;

		// Calculates the sum of the subset 
		for (int i = 0; i < theSet.length; i++)
			if (x[i] == 1)
				sum = sum + theSet[i];
		
		// Checks if the  sum is equal to target and prints the subset if it is.
		if (sum == targetNum) {
			System.out.print("{");
			for (int i = 0; i < theSet.length; i++)
				if (x[i] == 1)
					System.out.print(theSet[i] + ",");
			System.out.print("}, ");
		}

	}

	/**
	 *  The method finds the subsets with a certain sum.
	 */
	public void fSubSets(int[] arr, int tar) {

		int x = (int) Math.pow(2, arr.length);

		for (int i = 1; i < x; i++)
			addSubsets(arr, i, tar);
		
	}

	

}
