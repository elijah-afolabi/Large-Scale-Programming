package org.howard.edu.assignment7.tollbooth;

/** this represents a Ford-brand truck
*  */
public class FordTruck implements Truck {
	
	/** this represents the number of axles in the truck */
	private int axles;
	
	/** this represents the truck's weight (kilograms) */
	private int weight_kg;
	
	/** creates a Ford truck with specified weight and number of axles
	 * @param a (number of axles defined for an instance of FordTruck)
	 * @param w (weight in kilograms defined for an instance of FordTruck) */
	public FordTruck(int a, int w) {
		axles = a;
		weight_kg = w;
	}
	
	/** gets number of axles
	 * @return returns integer representing the number of axles in the truck */
	public int getAxles() {
		return axles;
	}
	
	/** gets the weight of the truck
	 * @return integer representing the weight of the truck (kilogram) */
	public int getWeight() {
		return weight_kg;
	}
}