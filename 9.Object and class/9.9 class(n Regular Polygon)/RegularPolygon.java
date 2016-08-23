package simple;
public class RegularPolygon{
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	public RegularPolygon() {
		
	}
	public RegularPolygon(int fixn,double fixside){
		n = fixn;
		side = fixside;
	}
	public RegularPolygon(int fixn,double fixside,double fixx,double fixy){
		n = fixn;
		side = fixside;
		x = fixx;
		y = fixy;
	}
	//get set
	public double getside(){
		return side;
	}
	public double getx(){
		return x;
	}
	public double gety(){
		return y;
	}
	public int getn(){
		return n;
	}
	public void setside(double newset){
		side = newset;
	}
	public void setn(int newn){
		n = newn;
	}
	public void setx(double newx){
		x = newx;
	}
	public void sety(double newy){
		y = newy;
	}
	public double getPerimeter(){
		return n*side;
	}
	public double getArea(){
		return (n*side*side)/(4*(Math.tan(Math.PI/n)));
	}
}