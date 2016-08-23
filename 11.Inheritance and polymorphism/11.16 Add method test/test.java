import java.util.ArrayList;
import java.util.Scanner;
public class test {
	public static void main(String args[]){
		ArrayList<Integer> rr= new ArrayList<>();
		Scanner input = new Scanner(System.in);
		boolean flag =true;
		while(flag){
			System.out.println("What is 5 + 9?");
			int a = input.nextInt();
			if(alreadyInput(rr, a)== false){
				rr.add(a);
				if(a == 14){
					flag = false;
					System.out.println("You got it !");
				}
				else{
					System.out.print("Wrong answer. Try again. ");
				}
			}
			
		}
		input.close();
		}
	public static boolean alreadyInput(ArrayList<Integer> list,int a){
		for(int i=0;i<list.size();i++)
			if(a == list.get(i)){
				System.out.println("You already entered "+a);
				return true;
			}
			
		return false;
	}
}