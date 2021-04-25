package javaTest;

class Main {

    /**

    */

  public static void main(String[] args) {
	  Tollbooth booth = new AlleghenyTollBooth();

		Truck ford = new FordTruck(5, 12000); 	// 5 axles and 12000 kilograms
		Truck nissan = new NissanTruck(2, 5000); 	// 2 axles and 5000kg
		Truck daewoo = new DaewooTruck(6, 17000); // ….
		//Truck tesla = new Tesla(4,2090);
		booth.calculateToll(ford);
		booth.displayData();
		booth.calculateToll(nissan);
		booth.reset();	//zero out receipts, print out aforementioned summary information.
		booth.calculateToll(daewoo);
		
		//booth.calculateToll(tesla);
		booth.displayData();	
		/**
		Tollbooth booth = new AlleghenyTollBooth();
		
		Truck ford = new FordTruck(4,13000);
		Truck tesla = new Tesla(4,2090);
		
		booth.calculateToll(ford);
		booth.displayData();
		booth.calculateToll(tesla);
		booth.reset(); //zero out receipts, print out aforementioned summary information
		booth.calculateToll(tesla);
		booth.displayData();
		*/
  }
}

/**
public class TestTollBooth {
public static void main(String [] args){
	Tollbooth booth = new AlleghenyTollBooth();

	Truck ford = new FordTruck(5, 12000); 	// 5 axles and 12000 kilograms
	Truck nissan = new NissanTruck(2, 5000); 	// 2 axles and 5000kg
	Truck daewoo = new DaewooTruck(6, 17000); // ….

	booth.calculateToll(ford);
	booth.displayData();
	booth.calculateToll(nissan);
	booth.reset();	//zero out receipts, print out aforementioned summary information.
	booth.calculateToll(daewoo);
	booth.displayData();	
}
}
*/