import java.util.Scanner;
	public class test {
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			System.out.println("���������ߣ�");
			double side1 = input.nextDouble();
			double side2 = input.nextDouble();
			double side3 = input.nextDouble();
			System.out.println("������ɫ��");
			String color = null;
			color = input.next();
			System.out.println("�Ƿ������ȫtrue or false?");
			boolean filled = input.nextBoolean();
			
			Triangle angle = new Triangle(side1,side2,side3,color,filled);
			System.out.println("�����"+angle.getArea());
			System.out.println("�߳���"+angle.getPerimeter());
			System.out.println("��ɫ��"+angle.getColor());
			System.out.println("filled��"+angle.isFilled());
			input.close();
		}
	}
