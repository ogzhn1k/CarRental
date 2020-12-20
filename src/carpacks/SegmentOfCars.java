//-------------------------------------------------------------------------------------------------------------------------------|
//SegmentOfCars.java                                                    Oðuzhan BÝRK 21893952                                    |
//                                                                 oguzhan1998-19@hotmail.com                                    |
//                                                                                                                               |
// This class is an Interface and it has methods of CarProps and other Segments. All methods is defined as an abstract method.   |                                                                                                                         |
// It consist of generally getters and setters.                                                                                                                              |  
//                                                                                                                               |
//-------------------------------------------------------------------------------------------------------------------------------|

package carpacks;

import java.util.Date;

public interface SegmentOfCars {
	
	public abstract void setPrice(int pr);
	public abstract int getPrice();
	public abstract void setExtras(int list);
	public abstract int getExtras();
	public abstract boolean getControl();
	public abstract void  setControl(boolean control);
	public abstract String getPlate();
	public abstract void setPlate(String pl);
	public abstract Date getRentalDate();
	public abstract void setRentalDate(Date rentalDt);
	public abstract Date getReturnDt();
	public abstract void setReturnDt(Date returnDt);
	public abstract int getNumOfTimesRented();
	public abstract void setNumOfTimesRented(int numOfTimesRented);
	public abstract String getLocation();
	public abstract void setLocation(String location);
}
