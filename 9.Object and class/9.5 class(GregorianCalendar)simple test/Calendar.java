package simple;
import java.util.GregorianCalendar;

public class Calendar{
	public static void main(String arg[]){
		GregorianCalendar data = new GregorianCalendar();
		data.setTimeInMillis(1234567898765L);
		System.out.println("Year:"+data.get(data.YEAR)+" Month: "+data.get(data.MONTH)+" Day: "+data.get(data.DAY_OF_MONTH));
	}
}
