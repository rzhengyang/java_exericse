package simple;

public class flew{
	public static void main(String args[]){
		java.util.Date data = new java.util.Date();
		data.setTime(1000);
		System.out.println(data.toString());
		data.setTime(10000);
		System.out.println(data.toString());
		data.setTime(100000);
		System.out.println(data.toString());	
		data.setTime(1000000);
		System.out.println(data.toString());	
		data.setTime(10000000);
		System.out.println(data.toString());	
		data.setTime(100000000);

		System.out.println(data.toString());	
		data.setTime(1000000000);
		System.out.println(data.getTime());
		
		System.out.println(data.toString());	
		data.setTime(1461805023*1000);


		
		System.out.println(data.toString());	
		java.util.Date data1 = new java.util.Date();
		System.out.println("The elapsed time since Jan 1, 1970 is "+ data1.getTime()+" milliseconds");
		System.out.println(data1.toString());
	}
}

