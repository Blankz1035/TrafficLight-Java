import java.awt.Color;

public class TrafficLight {
	
	// Instance fields
	private Bulb[] lights;
	
	
	//Constructors
	public TrafficLight(){
		lights = new Bulb[3];
		lights[0] = new Bulb(true,Color.RED, "Red");
		lights[1] = new Bulb(false,Color.YELLOW, "Yellow");
		lights[2] = new Bulb(false,Color.GREEN, "Green");
		
	}
	
	//assessors
	public Bulb[] getLights(){
		return lights;
	}
	
	public void setLights(Bulb[] lights){
		this.lights = lights;
	}
	
	// algorithms  (step by step process for changing light)
	
	public void changeState(){
		//red - Green
		if (lights[0].isOn()){
			lights[0].turnOff();
			lights[2].turnOn();
		}
		
		//Green -yellow
		else if(lights[2].isOn()){
			lights[2].turnOff();
			lights[1].turnOn();
		}
		//yellow to red
		else if (lights[1].isOn()){
			lights[1].turnOff();
			lights[0].turnOn();
		}
		
	}// end of changeState
	
	public String toString(){
		String result = "";
		
		for (int i = 0; i<lights.length; i ++){
			result += "Bulb " + (i + 1) + " is " + lights[i].getColorName() + " and " + lights[i].toString().toLowerCase() + "\n";			
		}//end loop
		return result;
	}// toString
	
} //end Class







