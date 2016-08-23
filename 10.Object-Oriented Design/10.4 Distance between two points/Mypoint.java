public class Mypoint {
	private double x=0;
	private double y=0;
	public Mypoint(){
		
	}
	public Mypoint(double x,double y){
		this.x = x;
		this.y = y; 
	}
	
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	//
	public double distance(int a,int b,Mypoint c){
		return Math.sqrt((a-c.x)*(a-c.x)+(b-c.y)*(b-c.y));
	}
	public double distance(int a,int b){
		return Math.sqrt((a-this.x)*(a-this.x)+(b-this.y)*(b-this.y));
	}
}