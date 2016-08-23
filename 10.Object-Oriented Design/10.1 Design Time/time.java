import java.util.Calendar;
import java.util.GregorianCalendar;
public class time{
	private long hour = 0;
	private long minute = 0;
	private long second = 0;
	public time(){
			
	}
	public time(long time){
		setTime(time);
	}
	public time(long hour,long minute,long second){
			
	}
	//get method
	public long getHour(){
		return hour;
	}
	public long getMinute(){
		return minute;
	}
	public long getSecond(){
		return second;
	}
	//setTime 
	public void setTime(long elapseTime){
		Calendar nowtime = new GregorianCalendar();
		nowtime.setTimeInMillis(elapseTime);
		minute = nowtime.get(Calendar.MINUTE);
		second = nowtime.get(Calendar.SECOND);
		hour = nowtime.get(Calendar.HOUR_OF_DAY);
	}
	
}