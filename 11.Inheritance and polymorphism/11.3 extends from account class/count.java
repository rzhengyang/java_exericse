import java.util.Date;

public class count{
	public static void main(String args[]){
		Date date = new Date();
		Account billy = new Account(1122,20000);
		billy.setRate(4.5);
		billy.withDraw(2500);
		billy.deposit(3000);
		billy.setdateCreated(date);
		System.out.println("余额 "+billy.getbalance());
		System.out.println("月利息 "+billy.getMonthlyInterest());
		System.out.println("开户日期 "+billy.getdateCreated());
	}
}
