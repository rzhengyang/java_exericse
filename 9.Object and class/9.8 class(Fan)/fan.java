public class fan{
	final int SLOW=1;
	final int MEDIUM=2;
	final int FAST=3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String colour = "blue";
	//get set 
	public int getspeed(){
		return speed;
	}
	public void setspeed(int newspeed){
		speed = newspeed;
	}
	public boolean geton(){
		return on;
	}
	public void seton(boolean newon){
		on = newon;
	}
	public double getradius(){
		return radius;
	}
	public void setradius(double newradius){
		radius=newradius;
	}
	public String getcolour(){
		return colour;
	} 
	public void setcolour(String newcolour){
		colour=newcolour;
	}
	//build
	public fan(){
		
	}
	public String toString(){
		if(on == false){
			return ("fan is off "+colour+radius);
		}
		else{
			return(speed+colour+radius);
		}
	}
}
