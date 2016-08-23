import java.util.Date;
	public class Account{
		private int id = 0;
		private double balance = 0;
		private double annualInterestRate = 0;
		private Date dateCreated;
		public Account(){
		} 
		public Account(int newid,double newbalance){
			id = newid;
			balance = newbalance;
		}
		//get set id
		public int getid(){
			return id;
		}
		public void setid(int newid){
			id = (newid >=0 ) ? newid:0;
		}
		//get set balance
		public double getbalance(){
			return balance;
		}
		public void setbalance(double newbalance){
			balance = (newbalance >=0) ? newbalance:0;
		}
		//get set annualInterserstRate
		public double getRate(){
			return annualInterestRate;
		}
		public void setRate(double newRate){
			annualInterestRate = (newRate >=0)? newRate:0;
		}
		//get dateCreated
		public Date getdateCreated(){
			return dateCreated;
		}
		public void withDraw(int drawbalance){
			setbalance(getbalance()-drawbalance);
		}
		public void deposit(int depban){
			setbalance(getbalance()+depban);
		}
		public double getMonthlyInterest(){
			return balance*((annualInterestRate/12)/100);
		}
	}