import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class Runner {

	public static void main(String[] args) {
		
		/*Bulb bulb1 = new Bulb(false, Color.RED, "Red");	
		System.out.println(bulb1);
		bulb1.turnOn();
		System.out.println(bulb1);*/
		
		//NON GRAPHICAL INSTANCES //
		/*TrafficLight light = new TrafficLight();
		System.out.println(light.getLights()[0]);
		System.out.println(light.getLights()[1]);
		System.out.println(light.getLights()[2]);
		
		//Can then use the changeState() method to change state of bulb
		light.changeState();
		System.out.println(light.getLights()[0]);
		System.out.println(light.getLights()[1]);
		System.out.println(light.getLights()[2]);*/
		
		//GUI USING JFRAME
		
		JFrame frame = new JFrame("Traffic Light");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Test frame and Panel
		/*JPanel panel = new JPanel();
		JLabel label1 = new JLabel ("Traffic Light");
		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(220, 260));
		frame.getContentPane().add(panel);
		panel.add(label1);
		*/
		frame.getContentPane().add(new TrafficLightPanel());
		frame.pack();
		frame.setVisible(true);
	
	
	}

}
