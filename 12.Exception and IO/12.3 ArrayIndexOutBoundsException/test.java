import java.util.Random;
import java.util.Scanner;
public class test {
	public static void main(String args[]){
		Random a = new Random();
		int b[] = new int[100];
		for(int i=0;i<100;i++)
			b[i]=a.nextInt(100);
		Scanner input = new Scanner(System.in);
		try{
		for(int i=0;i<100;i++)
		{
			int c = input.nextInt();	
			System.out.println(b[c]);
		}
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Out of Bounds");
		}
			input.close();
	}
}