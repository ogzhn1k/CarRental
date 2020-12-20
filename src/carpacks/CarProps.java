//-------------------------------------------------------------------------------------------------------------------------------|
//CarProps.java                                                    Oðuzhan BÝRK 21893952                                         |
//                                                                 oguzhan1998-19@hotmail.com                                    |
//                                                                                                                               |
// This class implements to SegmentOfCars Interface and it has properties of cars for example plate,rental date,free options et.c|
// Addition to this Constructor of it initialize the attributes                                                                  |  
// Note: Date class was used but it is deprecated in new java versions.                                                          |                                                                   |
//-------------------------------------------------------------------------------------------------------------------------------|

package carpacks;

import java.util.Date;

public abstract class CarProps implements SegmentOfCars {
	
	protected String plate; 
	protected Date rentalDt,returnDt;
	protected int numOfTimesRented;
	protected String location;
	protected int extras;
	

	public CarProps() {
		plate = "";
		rentalDt = new Date();
		returnDt = new Date();
		numOfTimesRented = 0;
		location = "Center";
		extras = 0;
	}
	
	public CarProps(String plate,Date rentalDt,Date returnDt,int numOfTimesRented,String location,int extras) {
		this.plate = plate;
		this.rentalDt = rentalDt;
		this.returnDt = returnDt;
		this.numOfTimesRented = numOfTimesRented;
		this.location = location;
		this.extras = extras;
	}

	
	
	

}
