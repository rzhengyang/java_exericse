package simple;

import java.util.Scanner;

public class test{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns of the array: ");
		int row = input.nextInt();
		int column = input.nextInt();
		
		double[][] a = new double[row][column];
		System.out.println("Enter the array: ");
		for(int i=0;i<row;i++)
			for(int j=0;j<column;j++){
				a[i][j] = input.nextDouble();
			}
		
		Location newLocation = new Location();
		
		System.out.println("���λ����ֵ "+ newLocation.locateLargets(a).getmaxValue()+ "���λ���� "+ 
				newLocation.locateLargets(a).getrow()+"���λ���� "+ 
						newLocation.locateLargets(a).getcolumn());
	}
}