/*
һ�� Jan.January
���� Feb.February
���� Mar.March
���� Apr.April
���� May.May
���� June.June
���� July.July
���� Aug.Aguest
���� Sept.September
ʮ�� Oct.October
ʮһ�� Nov.November
ʮ���� Dec.December
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class test {
	public static void main(String args[]){
		int month;
		int year;
		Calendar calendar = new GregorianCalendar();
		if(args.length==2){
			month = Integer.parseInt(args[0])-1;
			year = Integer.parseInt(args[1]);
		}
		else{
			month = calendar.get(calendar.MONTH);
			year = calendar.get(calendar.YEAR);
		}
		CalendarSetting(month,year);
		System.out.println("");
	}
	
	static void CalendarSetting(int month,int year){
		Calendar calendar = new GregorianCalendar(year,month,1);
		String monthEnString[] ={"Jan","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec" }; 
		System.out.println("          "+monthEnString[month]+","+year);
		System.out.println("------------------------------------");
		System.out.println(" Sun MON Tue Wed Thu Fri Sat");
		for(int j=0;j<(calendar.get(Calendar.DAY_OF_WEEK)-1);j++){
			System.out.print("    ");
			//System.out.print(calendar.get(Calendar.DAY_OF_WEEK));
		}
		System.out.print("   "+1);
		for(int i=2;i<=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);i++){
			//System.out.print("   "+i);
			if (calendar.get(Calendar.DAY_OF_WEEK) ==7 )
				System.out.println("");	
			
			calendar.add(calendar.DAY_OF_MONTH,1);
			if(i<10){
				System.out.print("   "+i);}
			else{
				System.out.print("  "+i);}	
			}
		
		}
	}