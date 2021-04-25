package org.howard.edu.assignment7.tollbooth;

/** this represents a tollbooth in Allegheny 
 *  */
public class AlleghenyTollBooth implements Tollbooth {
	
	/** this represents the total of all tolls collected before last reset */
	int receiptTotal;

	/** this represents the number of total truck arrivals before last reset */
	int arrivalTotal;
	
	/** this represents the display for the tollbooth */
	Display alleghenyDisplay = new Display();
	
	/** calculates the toll for a single truck.
	 * @param newTruck The truck who's toll is calculated */
	public void calculateToll(Truck newTruck) {
		
		/** this represents the price of the axles ($5 per axle) */
		int per_axle = newTruck.getAxles();		//this holds the number of axles

		/** this represents the price relative to the truck's weight ($10 per half-ton) */
		int per_hton = newTruck.getWeight();	//hold weight (kilograms)

		/** this represents the toll of the truck */
		int toll_due = 0;						//hold toll
		int halfTon = 2000/2;
		System.out.println();
		System.out.print("   Truck arrival \n--------------------\nAxles: " + per_axle + ", Weight: " + per_hton + "\n");
		
		per_axle *= 5; // 5 dollars per axle
		per_hton = (per_hton/halfTon) * 10; // 10 dollars per half-ton
		toll_due = per_axle + per_hton; // 5 dollars per axle + $10 per half-ton
		System.out.print("Toll due: $" + toll_due + "\n");
		
		receiptTotal += toll_due;			//add-on to receipt total
		arrivalTotal++;					//increment number of trucks that arrived
		alleghenyDisplay.setData(receiptTotal, arrivalTotal);
	}
	
	/** this display the total number of arrivals and receipts since the last reset */
	public void displayData() {
		alleghenyDisplay.displayData();
	}
	
	/** this resets the receipt and arrival totals */
	public void reset() {
		System.out.println();
		System.out.print("***Collecting Receipts***");
		alleghenyDisplay.displayData();
		
		receiptTotal = 0;
		arrivalTotal = 0;
		alleghenyDisplay.setData(0, 0);
	}
}