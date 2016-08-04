import java.awt.Color;


public class Runner {

	public static void main(String[] args) {
		
		/*Bulb bulb1 = new Bulb(false, Color.RED, "Red");	
		System.out.println(bulb1);
		bulb1.turnOn();
		System.out.println(bulb1);*/
		
		TrafficLight light = new TrafficLight();
		System.out.println(light.getLights()[0]);
		System.out.println(light.getLights()[1]);
		System.out.println(light.getLights()[2]);
		
		//Can then use the changeState() method to change state of bulb
		light.changeState();
		System.out.println(light.getLights()[0]);
		System.out.println(light.getLights()[1]);
		System.out.println(light.getLights()[2]);
		
	}

}
