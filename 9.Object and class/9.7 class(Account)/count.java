public class count{
	public static void main(String args[]){
		Account billy = new Account(1122,20000);
		billy.setRate(4.5);
		billy.withDraw(2500);
		billy.deposit(3000);
		
		System.out.println("��� "+billy.getbalance());
		System.out.println("����Ϣ "+billy.getMonthlyInterest());
		System.out.println("�������� "+billy.getdateCreated());
	}
}