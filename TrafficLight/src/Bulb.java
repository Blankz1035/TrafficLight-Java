import java.awt.Color;


public class Bulb {

	//instance variables
	
	private boolean on;
	private Color color;
	private String colorName;
	
	
	//Constructors
	
	public Bulb (boolean on){
		this.on = on;
	}
	
	public Bulb (boolean on, Color c, String cn){
		this.on = on;
		color = c;
		colorName = cn;
	}
	
	//assessors
	public boolean isOn(){ return on;}
	public boolean isOff(){ return !on;}
	
	//methods
	
	public void turnOn(){
		on = true;
	}
	public void turnOff(){
		on = false;
	}
	public Color getColor(){return color;}
	public void setColor(Color c) {color = c;}
	public String getColorName() {return colorName;}
	public void setColorName (String cn){colorName = cn;}
	
	
	
	
	
	public String toString(){
		String result;
		if (on){
			result = "The " + getColorName() + " light is on.";
		}
		else {
			result = "The " + getColorName() + " ight is off.";
		}
		return result;
	} 
	
	
}
