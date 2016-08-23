import java.util.Scanner;
	public class Atm {
		public static void main(String args[]){
			Account[] account = new Account[10];
			for(int i=0;i<10;i++){
				account[i] = new Account(i,1000);
			}
			Scanner input = new Scanner(System.in);
			while(true){
			System.out.println("Enter an id:");
		    int id_input = input.nextInt();
		    boolean flage = true;
		    while(flage){
		    //Main menu
		    System.out.println("Main menu");
		    System.out.println("1:chech balance");
		    System.out.println("2:withdraw");
		    System.out.println("3:deposit");
		    System.out.println("4:exit");
		    System.out.println("Enter a choice:");
		    int choice_input = input.nextInt();
		    	switch(choice_input){
		    	case 1:System.out.println("The balance is "+ account[id_input].getbalance());break;
		    	case 2:System.out.println("Enter an amount to withdraw:");
		    			int withdraw_input = input.nextInt();
		    			account[id_input].withDraw(withdraw_input);break;
		    	case 3:System.out.println("Enter an amount to deposit:");
		    			int deposit_input = input.nextInt();
		    			account[id_input].deposit(deposit_input);break;
		    	case 4:flage = false;break;
		    	default:break;
		    	}
			}
		    }
		}
	}
