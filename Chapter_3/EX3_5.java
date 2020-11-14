package Chapter_3;
import java.util.Scanner;
public class EX3_5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter today's day: ");
		int today=input.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int elapse_day=input.nextInt();
		int future_day=(today+elapse_day)%7;
		System.out.print("Today is "+Day(today)+" and the future day is "+Day(future_day));		
	}
	public static String Day(int day) {
		String day_name = "";
		if(day==0) day_name="Sunday";
		else if(day==1) day_name="Monday";
		else if(day==2) day_name="Tuesday";
		else if(day==3) day_name="Wednesday";
		else if(day==4) day_name="Thursday";
		else if(day==5) day_name="Friday";
		else if(day==6) day_name="Saturday";
		return day_name;
	}
}
