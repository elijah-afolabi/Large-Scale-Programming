package org.howard.edu.assignment7.tollbooth;

/** this represents a Tesla truck
*  */
public class Tesla implements Truck {
	
	/** this represents the number of axles in the truck */
	private int axles;
	
	/** this represents the truck's weight in kilograms */
	private int weight_kg;
	
	/** this creates a Tesla truck with specified weight and number of axles
	 * @param a number of axles defined for an instance of FordTruck
	 * @param w The weight in kilograms defined for an instance of FordTruck */
	public Tesla(int a, int w) {
		axles = a;
		weight_kg = w;
	}
	
	/** this gets the number of axles.
	 * @return (integer representing the number of axles in the truck) */
	public int getAxles() {
		return axles;
	}
	
	/** this gets the weight of the truck
	 * @return (integer representing the weight of the truck in kilograms) */
	public int getWeight() {
		return weight_kg;
	}
}