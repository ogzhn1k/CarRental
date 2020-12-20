package carpacks;

import javax.swing.JFrame;

public class Test {

	public static void main(String[] args) {
		
		CarRentalGUI rent = new CarRentalGUI();

		
		 
		rent.setTitle("Car Rental Company");
		rent.setSize(300,300);
		//rent.setLocation(200,300);
		

		
		rent.setVisible(true);
		rent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
