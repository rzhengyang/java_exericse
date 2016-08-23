package simple;

public class Main {
		public static void main(String[] args){
			Rectangle a1 = new Rectangle(4,40);
			System.out.println("a1 width = "+ a1.width + " height = " + a1.height);
			System.out.println("a1 Area = " + a1.getArea() + " Perimeter() = " + a1.getPerimeter());
			Rectangle a2 = new Rectangle(3.5,35.9);
			System.out.println("a2 width = "+ a2.width + " height = " + a2.height);
			System.out.println("a2 Area = " + a2.getArea() + " Perimeter() = " + a2.getPerimeter());
		}
}