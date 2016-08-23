import java.util.Scanner;
	public class test {
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			System.out.println("输入三条边：");
			double side1 = input.nextDouble();
			double side2 = input.nextDouble();
			double side3 = input.nextDouble();
			System.out.println("输入颜色：");
			String color = null;
			color = input.next();
			System.out.println("是否填充完全true or false?");
			boolean filled = input.nextBoolean();
			
			Triangle angle = new Triangle(side1,side2,side3,color,filled);
			System.out.println("面积："+angle.getArea());
			System.out.println("边长："+angle.getPerimeter());
			System.out.println("颜色："+angle.getColor());
			System.out.println("filled："+angle.isFilled());
			input.close();
		}
	}
