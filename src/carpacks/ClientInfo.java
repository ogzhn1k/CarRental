//-------------------------------------------------------------------------------------------------------------------------------|
//ClientInfo.java                                                    Oðuzhan BÝRK 21893952                                       |
//                                                                 oguzhan1998-19@hotmail.com                                    |
//                                                                                                                               |
// This class consist of attributes about Clients for example client ID, total money, et.c                   
// ClientInfo class defines Clients who rents cars.                                                                   
//                                                                                                                               |
//-------------------------------------------------------------------------------------------------------------------------------|

package carpacks;

import java.util.ArrayList;

public class ClientInfo {
	
	private String clientId;
	private int numOfTimesBook;
	private float totalMoney;
	private ArrayList<SegmentOfCars> cars;
	
	public ClientInfo() {
		clientId = "";
		numOfTimesBook = 0;
		totalMoney = 0;
		cars = new ArrayList<SegmentOfCars>();
	}
	
	public ClientInfo(String clientId,int numOfTimesBook,int totalMoney) {
		this.clientId = clientId;
		this.numOfTimesBook = numOfTimesBook;
		this.totalMoney = totalMoney;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public int getNumOfTimesBook() {
		return numOfTimesBook;
	}

	public void setNumOfTimesBook(int numOfTimesBook) {
		this.numOfTimesBook += numOfTimesBook;
	}

	public float getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(float totalMoney) {
		this.totalMoney = totalMoney;
	}

	public ArrayList<SegmentOfCars> getCars() {
		return cars;
	}

	public void setCars(ArrayList<SegmentOfCars> cars) {
		this.cars = cars;
	}

	
	
	

}
