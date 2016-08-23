import java.util.Scanner;


public class test {
	public static void main(String args[]){
		rzyStack rzy = new rzyStack();
		Scanner input = new Scanner(System.in);
		rzy.push(input.next());
		rzy.push(input.next());
		rzy.push(input.next());
		rzy.push(input.next());
		rzy.push(input.next());
		for(int i=0;i<5;i++)
			System.out.println(rzy.pop());
		input.close();
	}
}
