package org.howard.edu.assignment7.tollbooth;
	/** this represents a tollbooth display
	 *  */
	public class Display {
		
		/** this represents the total of all tolls collected before last reset */
		int receipts;

		/** this represents the total of all truck arrivals before last reset */
		int arrivals;
		
		/** update the data for the display.
		 * @param R The new total of receipts.
		 * @param A The new total of arrivals. */
		public void setData(int R, int A) {
			receipts = R;
			arrivals = A;
		}
		
		/** this displays the total number of arrivals and receipts since the last reset */
		void displayData() {
			System.out.println();
			System.out.print("Totals since last collection - Receipts: $" + receipts + ", Trucks: " + arrivals + "\n");
		}
	}

