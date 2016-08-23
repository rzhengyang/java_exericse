import java.util.*;
public class TestCalendar {
	public static void main(String args[]){
		Calendar calendar = new GregorianCalendar();
		System.out.println("Current time is "+ new Date());
		System.out.println("YEAR: "+ calendar.get(calendar.YEAR));
		System.out.println("MONTH: "+ calendar.get(calendar.MONTH));
		System.out.println("DATE: "+ calendar.get(calendar.DATE));
		System.out.println("HOUR: "+ calendar.get(calendar.HOUR));
		System.out.println("HOUR_OF_DAY: "+ calendar.get(calendar.HOUR_OF_DAY));
		//System.out.println("Current time is "+ new Date());
		//System.out.println("Current time is "+ new Date());
	}
}