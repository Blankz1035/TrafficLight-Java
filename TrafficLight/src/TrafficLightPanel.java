import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//child of JPanel---
public class TrafficLightPanel extends JPanel{

	//instance variables
	private TrafficLight light;
	private final int X = 100, Y = 100, WIDTH = 60, HEIGHT = 130;
	private final int DIAMETER = 30;
	private final int X_OFFSET = 12, Y_OFFSET = 12;
	
	
	//constructors
	
	public TrafficLightPanel(){
		light = new TrafficLight();
		JButton changeButton = new JButton("Change Light");
		changeButton.addActionListener(new ChangeListener());
		add (changeButton);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(250, 300));
		
	}
	
	
	//methods
	
	public void paintComponent(Graphics page){
		super.paintComponent(page);
		//draw the rectangle
		page.setColor(Color.LIGHT_GRAY);
		page.fillRect(X, Y, WIDTH, HEIGHT);
		
		//draw red light
		if (light.indexOfLitBulb()==0){
			page.setColor(Color.RED);
		}
		else {page.setColor(Color.DARK_GRAY);}
		page.fillOval(X+X_OFFSET, Y+Y_OFFSET, DIAMETER, DIAMETER);
		
		//draw Yellow light
		if (light.indexOfLitBulb()==1){
			page.setColor(Color.YELLOW);
		}
		else {page.setColor(Color.DARK_GRAY);}
		page.fillOval(X+X_OFFSET, Y+DIAMETER+2*Y_OFFSET, DIAMETER, DIAMETER);
		
		//draw Green light
		if (light.indexOfLitBulb()==2){
			page.setColor(Color.GREEN);
		}
		else {page.setColor(Color.DARK_GRAY);}
		page.fillOval(X+X_OFFSET, Y+2*DIAMETER+3*Y_OFFSET, DIAMETER, DIAMETER);
		
	} // end of method
	
	private class ChangeListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			light.changeState();
			repaint();	
		}
	}// end private class	
}// end of class
