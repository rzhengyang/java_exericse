
public class test{
	public static void main(String args[]){
		time t1 = new time(); 
		time t2 = new time(555550000);
		time t3 = new time(System.currentTimeMillis());
		System.out.println("Hour"+t1.getHour()+" Minute"+t1.getMinute()+" Second"+t1.getSecond());
		System.out.println("Hour"+t2.getHour()+" Minute"+t2.getMinute()+" Second"+t2.getSecond());
		System.out.println("Hour"+t3.getHour()+" Minute"+t3.getMinute()+" Second"+t3.getSecond());
	}
}