import java.awt.Color;


public class Runner {

	public static void main(String[] args) {
		
		Bulb bulb1 = new Bulb(false, Color.RED, "Red");	
		System.out.println(bulb1);
		bulb1.turnOn();
		System.out.println(bulb1);
		
		
	}

}
