import java.util.ArrayList;
import java.util.Scanner;
public class test {
	public static void main(String args[]){
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter integers (input ends with 0)");
		Integer value=1;
		while(value != 0){
			value = input.nextInt();
			if(!list.contains(value) && value!=0){
				list.add(value);
			}
		}
		System.out.println(arraylist.max(list));
		input.close();
	}
}
