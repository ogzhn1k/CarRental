//-------------------------------------------------------------------------------------------------------------------------------|
// ReservationGUI.java                                                    Oðuzhan BÝRK 21893952                                         |
//                                                                 oguzhan1998-19@hotmail.com                                    |
//                                                                                                                               |
// The purpose of this class is making reservation. Users can choose different options. 
// In this class users can do invoicing process and then take confirm message.                                                                  
//  
//
//-------------------------------------------------------------------------------------------------------------------------------|

package carpacks;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

import javax.swing.*;

public class ReservationGUI extends JFrame {
    
	private JLabel freesLabel,extrasLabel,clientIdLabel,locationL;
	private JTextField clientIdTextField,locationT;
	private JButton makereserv,invoicingButton,exitButton;
	private JPanel frees,extras;
	private JComboBox<String> transmission,door,smoke,segment;
	private JCheckBox roof,trailer,snowchain,childseat;
	private Container c = getContentPane();
	private SegmentOfCars[]sg;
	private ClientInfo[] cInfos;
	
	public ReservationGUI(SegmentOfCars[] sg,ClientInfo[] cInfos) {
		
		locationL = new JLabel("Location: ");
		locationT = new JTextField(20);
		makereserv = new JButton("Submit");
		invoicingButton = new JButton("Invoicing");
		frees = new JPanel();
		extras = new JPanel();
		freesLabel = new JLabel("Free Options : ");
		extrasLabel = new JLabel("Extra Options");
		clientIdLabel = new JLabel("Client ID : ");
		clientIdTextField = new JTextField(9);
		exitButton = new JButton("Back");
		
		this.cInfos = cInfos;
		this.sg = sg;
		
		
		String []tr = {"Automatic","Manual"};
		transmission = new JComboBox<String>(tr);
		String []dr = {"Two","Four"};
		door =   new JComboBox<String>(dr);
		String smk[] = {"Smoker","Non-Smoker"};
		smoke =   new JComboBox<String>(smk);
		frees.setBackground(Color.GREEN);
		extras.setBackground(Color.RED);
		roof = new JCheckBox("Roof Rack (5$)");
		trailer = new JCheckBox("Trailer (5$)");
		snowchain = new JCheckBox("Snow Chain (5$)");
		childseat = new JCheckBox("Child Seat (5$)");
		
		
		c.add(clientIdLabel);
		c.add(clientIdTextField);
		c.add(locationL);
		c.add(locationT);
		frees.add(freesLabel);
		frees.add(transmission);
		frees.add(door);
		frees.add(smoke);
		
		extras.add(extrasLabel);
		extras.add(roof);
		extras.add(trailer);
		extras.add(snowchain);
		extras.add(childseat);
		
		//c = getContentPane();
		
		String []sgmnts = {"Low Segment","Mid Segment","High Segment"};
		
		segment = new JComboBox<String>(sgmnts); 
		
		//c = getContentPane();
		FlowLayout fl = new FlowLayout();
		
		c.setLayout(fl);
		c.add(segment);
		c.add(frees);
		c.add(extras);
		c.add(makereserv);
		c.add(invoicingButton);
		c.add(exitButton);
		EventHandler eh = new EventHandler();
		//segment.addActionListener(eh);
		makereserv.addActionListener(eh);
		invoicingButton.addActionListener(eh);
        exitButton.addActionListener(eh);
	
	}
	

	public void setSg(SegmentOfCars[] sg) {
		this.sg = sg;
	}



	public void setcInfos(ClientInfo[] cInfos) {
		this.cInfos = cInfos;
	}
	

	public SegmentOfCars[] getSg() {
		return sg;
	}



	public ClientInfo[] getcInfos() {
		return cInfos;
	}



	class EventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource() == invoicingButton) {
	
				
				int numofExtras = 0;
				if(roof.isSelected())
					numofExtras+=1;
				if(trailer.isSelected())
					numofExtras+=1;
				if(snowchain.isSelected())
					numofExtras+=1;
				if(childseat.isSelected())
					numofExtras+=1;
				
				int p=0;
				String index = clientIdTextField.getText();
					
					if(segment.getSelectedIndex() == 0) {
						for(int i=0 ;i<10 ; i++ ) {
							if(sg[i].getControl() == true) {
								 sg[i].setExtras(numofExtras);
								 p = sg[i].getPrice()+sg[i].getExtras()*5;
								 sg[i].setPrice(p);
								 sg[i].setNumOfTimesRented(sg[i].getNumOfTimesRented()+1);
								 sg[i].setLocation(locationT.getText());
								 JOptionPane.showMessageDialog(null, "Please pay "+Integer.toString(p)+"$");
								 sg[i].setControl(false);
								 if(index.equals("")) {
										cInfos[i].setClientId(i+"");
										
									}
									
								 break;
		  
						}
						
					}
					}
					
					if(segment.getSelectedIndex() == 1) {
	
						for(int i=10 ;i<20 ; i++ ) {
							sg[i] = new  MidSegment();
							if(sg[i].getControl() == true) {
								 sg[i].setExtras(numofExtras);
								 p = sg[i].getPrice()+sg[i].getExtras()*5;	
								 sg[i].setPrice(p);
								 sg[i].setLocation(locationT.getText());
								 sg[i].setNumOfTimesRented(sg[i].getNumOfTimesRented()+1);
								 JOptionPane.showMessageDialog(null,"Please pay "+ Integer.toString(p)+"$");
								 if(index.equals("")) {
										cInfos[i].setClientId(i+"");
										
									}

								 break;
							}
								   
						}
						
					}
					
					
					if(segment.getSelectedIndex() == 2) {
						for(int i=20 ;i<30 ; i++ ) {
							sg[i] = new HighSegment();
							if(sg[i].getControl() == true) {
								
								 sg[i].setExtras(numofExtras);
								 p = sg[i].getPrice()+sg[i].getExtras()*5;
								 sg[i].setPrice(p);
								 sg[i].setLocation(locationT.getText());
								 sg[i].setNumOfTimesRented(sg[i].getNumOfTimesRented()+1);
								 JOptionPane.showMessageDialog(null,"Please pay "+ Integer.toString(p)+"$");
								 sg[i].setControl(false);
								 if(index.equals("")) {
										cInfos[i].setClientId(i+"");
										
									}
								      
								 break;
							}
						
								
						}
					
					}
					
					/*for(int i=0 ;i<30;i++) {
						if(index.equals(cInfos[i].getClientId())) {
							cInfos[i].setNumOfTimesBook(cInfos[i].getNumOfTimesBook()+1);
							 cInfos[i].setTotalMoney(cInfos[i].getTotalMoney()+p);
							 ArrayList<SegmentOfCars> list = cInfos[i].getCars();
							 list.add(sg[i]);
							 cInfos[i].setCars(list);
						}
						
						
					}*/
					
					
					setSg(sg);
					setcInfos(cInfos);
					

			}
			
			if(ae.getSource() == makereserv) {
				
				JOptionPane.showMessageDialog(null, "Your reservation has been confirmed");
	
			}
			
			if(ae.getSource() == exitButton)
				dispose();
				

		}
		
		
	}
	
	
	
	}
