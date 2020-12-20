//-------------------------------------------------------------------------------------------------------------------------------|
//ReportGUI.java                                                    Oðuzhan BÝRK 21893952                                         |
//                                                                 oguzhan1998-19@hotmail.com                                    |
//                                                                                                                               |
// The purpose of this class is giving information about cars or clients to users by using plate or ID number.
// If we have not any client program tells us to this.                                                                 
// 
//
//-------------------------------------------------------------------------------------------------------------------------------|



package carpacks;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

public class ReportGUI extends JFrame{

	private JLabel clientIdL,plateL;
	private JTextField clientIdTf,plateTf;
	private JButton clinfoButton,exitButton;
	private JButton plateInfoButton;
	private JTextArea clientArea;
	private JTextArea carArea;
    private SegmentOfCars[]sg;
	private ClientInfo[] cInfos;
	private JPanel carPanel,clientPanel,textPanel;
	
	public ReportGUI(SegmentOfCars[] sg,ClientInfo []cInfos) {
		clientIdL = new JLabel("Client ID: ");
		clientIdTf = new JTextField(9);
	    clinfoButton = new JButton("Get Client Informations");
	    exitButton = new JButton("Back");
	    
	    carArea = new JTextArea(30,35);
	    clientArea = new JTextArea(30,30);
	    
	    carArea.setEditable(false);
	    clientArea.setEditable(false);
	    
	    this.sg = sg;
	    this.cInfos = cInfos;
	    
		plateL = new JLabel("Car Plate: ");
		plateTf = new JTextField("Plate",9);
		plateInfoButton = new JButton("Get Car Informations");
		
	    FlowLayout fl = new FlowLayout();
		Container c = getContentPane();
		c.setLayout(fl);
		
		carPanel = new JPanel();
		clientPanel = new JPanel();
		textPanel = new JPanel();
		
		carPanel.add(plateL);
		carPanel.add(plateTf);
		carPanel.add(plateInfoButton);
		
		
		clientPanel.add(clientIdL);
		clientPanel.add(clientIdTf);
		clientPanel.add(clinfoButton);
		
		textPanel.add(clientArea);
		textPanel.add(carArea);
	
		
		//c.add(clientIdL);
		//c.add(clientIdTf);
		//c.add(plateL);
		//c.add(plateTf);
		//c.add(plateInfoButton);
		//c.add(clinfoButton);
		//c.add(carArea);
		//c.add(clientArea);
		//c.add(exitButton);
		
		c.add(clientPanel);
		c.add(carPanel);
		c.add(textPanel);
		c.add(exitButton);
		EventHandler eh = new EventHandler();
		
		clinfoButton.addActionListener(eh);
		plateInfoButton.addActionListener(eh);
		exitButton.addActionListener(eh);
		
	}
	


	public void setcInfos(ClientInfo[] cInfos) {
		this.cInfos = cInfos;
	}


	public void setSg(SegmentOfCars[] sg) {
		this.sg = sg;
	}



	public class EventHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource() == clinfoButton) {	
				
				
				String Id = clientIdTf.getText();
				//if() Client Id ile kontrol edilecek
				
				try {
				for(int i=0;i<30;i++) {
					if(cInfos[i].getClientId().equals(Id)) {
						for(int j=0;j<cInfos[i].getCars().size();j++)
						clientArea.append(cInfos[i].getNumOfTimesBook()+" times booked --> Location: "+cInfos[i].getCars().get(j).getLocation()+" Total Money : "+cInfos[i].getTotalMoney()+"$\n");
					    
					}
					
				}
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, "There is no any client");
				}

			}
			
			if(ae.getSource() == plateInfoButton) {

				
				for(int j=0;j<30;j++) {

					if(sg[j].getPlate().equals(plateTf.getText())) {
						
					  carArea.append(sg[j].getNumOfTimesRented()+" "+sg[j].getRentalDate()+" "+sg[j].getReturnDt()+"\n");

						 
					}
					}
				
				
				
				
			}
			
			if(ae.getSource() == exitButton)
				dispose();
			
			
		}
		

	}
	
	
	
	
	
	
}
