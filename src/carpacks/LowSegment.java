//-------------------------------------------------------------------------------------------------------------------------------|
//LowSegment.java                                                    Oðuzhan BÝRK 21893952                                         |
//                                                                 oguzhan1998-19@hotmail.com                                    |
//                                                                                                                               |
// All cars divided by segments so they split up three segment : Low, Mid , High
// This class carries feature of Low segment price cars. Only raw price is different.                                                                  
//  Moreover it inherits from CarProps abstract class.(extends-is-a-relationship)
//  Control attribute controls any car is rented or not
//-------------------------------------------------------------------------------------------------------------------------------|

package carpacks;

import java.util.Date;

public  class LowSegment extends CarProps  {
	
	private int price;
	private boolean control;
	
	public LowSegment() {
		super();
		price = 50;
		control= true;
	}
	
	public void setPrice(int price) {
			this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String toString() {
		return "Low Segment Cars";
	}


	@Override
	public void setExtras(int list) {
		this.extras = list;
	}

	@Override
	public int getExtras() {
		return this.extras;
	}

	@Override
	public boolean getControl() {
		return this.control;
	}

	@Override
	public void setControl(boolean control) {
		this.control = control;
	}

	@Override
	public String getPlate() {
		return this.plate;
	}

	@Override
	public void setPlate(String plate) {
		this.plate = plate;
	}

	@Override
	public Date getRentalDate() {
		return this.rentalDt;
	}

	@Override
	public void setRentalDate(Date rentalDt) {
		this.rentalDt = rentalDt;
	}

	@Override
	public Date getReturnDt() {
		return this.returnDt;
	}

	@Override
	public void setReturnDt(Date returnDt) {
		this.returnDt = returnDt;
		
	}

	@Override
	public int getNumOfTimesRented() {
		return this.numOfTimesRented;
	}

	@Override
	public void setNumOfTimesRented(int numOfTimesRented) {
		this.numOfTimesRented = numOfTimesRented;
	}

	@Override
	public String getLocation() {
		return this.location;
	}

	@Override
	public void setLocation(String location) {
		this.location = location;
		
	}
	
	
	
}
