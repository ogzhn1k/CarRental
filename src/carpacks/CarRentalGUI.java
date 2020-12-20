//-------------------------------------------------------------------------------------------------------------------------------|
//CarRentalGUI.java                                                    Oðuzhan BÝRK 21893952                                         |
//                                                                 oguzhan1998-19@hotmail.com                                    |
//                                                                                                                               |
// This class is a general GUI and consists of another GUI's. Users can reach reservation GUI  or  reports GUI in here.
// Clients and Cars was initialized in this class.                                                                 
// Plates :  06 ABC XX 
// We have 30 cars(10 Low, 10 Mid, 10 High)
//-------------------------------------------------------------------------------------------------------------------------------|

package carpacks;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.*;
public class CarRentalGUI extends JFrame implements ActionListener{
	
	
	private JButton makeReservationButton,reportButton,exitButton;
	private SegmentOfCars[]sg = new  SegmentOfCars[30];
	private ClientInfo[] cInfos = new ClientInfo[30] ;
	//private JButton invoicingButton;
	//File myObj = new File("filename.txt");
	private ReservationGUI mr;
	private JLabel bckg;
	
	public CarRentalGUI() {
		
		
		
		for(int i=0 ; i<30 ; i++) {
			
			cInfos[i] = new ClientInfo();
			
			if(i<10) 
				sg[i] = new LowSegment();
			else if(i<20)
				sg[i] = new MidSegment();
			else
				sg[i] = new HighSegment();
			
			sg[i].setPlate("06"+" ABC "+(i+10));
		}
		
		bckg = new JLabel();
		Image wallPaper = new ImageIcon(CarRentalGUI.class.getResource("/rent-a-car.png")).getImage();
		bckg.setIcon(new ImageIcon(wallPaper));
		 
		makeReservationButton = new JButton("Reservation");
		//invoicingButton = new JButton("Invoicing");
		reportButton = new JButton("Report");
		exitButton = new JButton("Exit");
		//"C:\\Users\\oguzh\\OneDrive\\Belgeler\\JAVA Proj\\BIL343-HOMEWORK2\\img")
		Color oldColor = makeReservationButton.getBackground();
		
		FlowLayout fl = new FlowLayout();
		Container c = getContentPane();
		c.setLayout(fl);

		c.add(makeReservationButton);
		//c.add(invoicingButton);
		c.add(reportButton);
		c.add(exitButton);
		c.add(bckg);
		exitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int cont = JOptionPane.showConfirmDialog(null, "Are you sure want to exit?");
				if(cont == 0)
				  System.exit(0);	
			}	
		});
		
		 exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setBackground(Color.RED);
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setBackground(oldColor);
				
			}
			
			
		});
		
		
		makeReservationButton.addActionListener(this);
		//invoicingButton.addActionListener(this);
		reportButton.addActionListener(this);
	
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == makeReservationButton) {
		    mr = new ReservationGUI(sg,cInfos);
			mr.setSize(600,250);
			mr.setVisible(true);
			//mr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		if(ae.getSource() == reportButton) {
			
			ReportGUI rep = new ReportGUI(sg,cInfos);
			    rep.setSg(sg);
			    rep.setcInfos(cInfos);
			    rep.setSize(500,400);
				rep.setVisible(true);
				//rep.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}
		
		
	
		
	}	
	


}
