package simple;

import java.util.Random;

public class random{
	public static void main(String arg[]){
		Random random1 = new Random(1000);
		System.out.println("From random1: ");
		for (int i=0 ; i<50; i++){
			
			System.out.println(random1.nextInt(100)+ " ");
		}
	}
}