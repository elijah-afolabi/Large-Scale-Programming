package javaTest;

/** this represents a tollbooth
 *  */
public interface Tollbooth {
	
	/** this function calculate the toll for a single truck
	 * @param newTruck The truck who's toll is calculated */
	void calculateToll(Truck newTruck);
	
	/** this function display the total number of arrivals and receipts since the last reset */
	void displayData();
	
	/** this fucntion resets the receipt and arrival totalsn */
	void reset();
}
