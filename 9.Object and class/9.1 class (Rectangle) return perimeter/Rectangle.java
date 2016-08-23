package simple;

public class Rectangle {
	double width,height;
	
	Rectangle(){
		width=1;
		height=1;
	}
	
	Rectangle(double a,double b){
		width= a;
		height= b;
	}

	double getArea(){
		return width*height;
	}
	
	double getPerimeter(){
		return 2*(width+height);
	}

}
