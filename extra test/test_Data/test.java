package simple;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class test {
	public static void main(String args[]){
		Date date = new Date();
		System.out.println(date.getTime());
///
		Date date2 = new Date();
		date2.setTime(1463068621054L);
		SimpleDateFormat dateFm = new SimpleDateFormat("yyyy-MM-dd-E HH:mm:ss");//EEEE代表星期，MMMM代表月份，而dd代表日，yyyy代表年
		System.out.println(dateFm.format(date2));

///
		System.out.println(" ");
		System.out.println("日历模式");
///
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(new Date());
		System.out.println("System Date: " + dateFormat.format(cal.getTime()));
		cal.set(GregorianCalendar.DAY_OF_WEEK,GregorianCalendar.THURSDAY);
		System.out.println("After Setting Day of Week to Friday: " +
		dateFormat.format(cal.getTime()));
	}
}
