import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class test {
	public static void main(String arg[]){
		Scanner input = new Scanner(System.in);
		boolean flage = true;
		while(flage){
		try{
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println(a+b);
		flage = false;
		}
		catch(InputMismatchException ex){
			System.out.println("Wrong input tay again.");
			input.nextLine();
			}
		}
		input.close();
	}
}